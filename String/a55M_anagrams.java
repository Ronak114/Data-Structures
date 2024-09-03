import java.util.*;

public class a55M_anagrams {
    public static void main(String args[]) {
        String s = "care";
        String s1 = "race";

        // convert to lowercse so that no need to check for uppercase.
        s = s.toLowerCase();
        s1 = s1.toLowerCase();
        System.out.println(s.length());

        // check the lengths
        if (s.length() == s1.length()) {
            // convert string into char array
            char[] scharArr = s.toCharArray();
            char[] s1charArr = s1.toCharArray();
            // sort char array
            Arrays.sort(scharArr);
            Arrays.sort(s1charArr);

            // if identical then anagram
            boolean result = Arrays.equals(s1charArr, scharArr);

            if (result) {
                System.out.println("Anagram");
            } else {
                System.out.println("not anagram");
            }
        } else {
            System.out.println("not anagram");
        }
    }
}
