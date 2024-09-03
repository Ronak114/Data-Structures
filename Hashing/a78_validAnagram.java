import java.util.HashMap;
import java.util.Set;

// O(n )
public class a78_validAnagram {
    public static void main(String[] args) {
        String s1 = "knee";
        String s2 = "keen";

        if (s1.length() != s2.length()) {
            System.out.println("false");
            return;
        }

        HashMap<Character, Integer> hm = new HashMap<>();

        // loop to store char and freq in hashtable
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        // loop to clear char and freq in hashtable
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            // if map already contain key
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) - 1);
                // imp condn
                if (hm.get(ch) == 0) {
                    hm.remove(ch);
                }
            }
            // if not then add
            else {
                System.out.println("false");
            }
        }

        if (hm.isEmpty()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
