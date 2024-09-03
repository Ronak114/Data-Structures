public class a82_findsubsetBT {
    public static void findSubSet(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // recursion
        // yes choice
        findSubSet(str, ans + str.charAt(i), i + 1);
        // No choice
        findSubSet(str, ans, i + 1);
    }

    public static void main(String args[]) {
        String str = "abc";
        findSubSet(str, "", 0);
    }
}
//TC-O(n*2^n).....1 subset to n toh 2^n subset ko n*2^n...n element 2^n subsets(permutation having 2 choices YES NO)
//SC-O(n)
