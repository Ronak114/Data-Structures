import java.util.Stack;

public class a19_validparentheses {
    // TC- O(n).
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // ''-char. ""-string.

            // opening brackets
            if (c == '(' || c == '{' || c == '[') {
                s.push(c);
            } else {
                // closing brackets
                if (s.isEmpty()) { // for --> ")))))"
                    return false;
                }
                if ((s.peek() == '(' && c == ')') || (s.peek() == '{' && c == '}') || (s.peek() == '[' && c == ']')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        String str = "({[]}())";
        System.out.println(isValid(str));
    }
}
