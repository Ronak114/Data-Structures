import java.util.*;

public class a30_firstNonRep {
    public static void printNonRepeating(String s) {
        // array to store alpha's freq
        int freq[] = new int[26];

        // Queue
        Queue<Character> q = new LinkedList<>();

        // to traverse every alpha
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            q.add(c);
            freq[c - 'a']++;

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }
            if (q.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }

    }

    public static void main(String[] args) {
        String str = "aabccxb";
        printNonRepeating(str);
    }
}
