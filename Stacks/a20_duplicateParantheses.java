import java.util.Stack;

public class a20_duplicateParantheses {
    // TC o(n)
    public static boolean duplicateParatheses(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // closing bracket
            if (c == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                } else {
                    // opening bracket
                    s.pop();
                }
            } else {
                s.push(c);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b)+(c+d))";
        String st = "((a+b))";
        System.out.println(duplicateParatheses(str));
        System.out.println(duplicateParatheses(st));
    }
}
