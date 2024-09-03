public class a50D_palindrome {
    // palindrome means same from both side.example : "racecar","noon","madam".

    // check a string is palindrome or not.
    public static boolean palindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String str1 = "noon";
        String str2 = "noonn";
        System.out.println(palindrome(str1));
        System.out.println(palindrome(str2));
    }
}
//TC...O(n).
