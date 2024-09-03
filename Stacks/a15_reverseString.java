import java.util.*;

public class a15_reverseString {
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int i = 0;
        // push all characters
        while (i < str.length()) {
            s.push(str.charAt(i));
            i++;
        }

        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty()){
            char c = s.pop();
            sb.append(c);
        }

        return sb.toString();
        
    }

    public static void main(String[] args) {
       String s="abc";
       System.out.print(reverseString(s));
    }

}
