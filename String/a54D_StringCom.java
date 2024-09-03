public class a54D_StringCom {

    public static String Compression(String s) {
        String newStr = "";
        for (int i = 0; i < s.length(); i++) {
            Integer count = 1;
            while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += s.charAt(i);
            if (count > 1) {
                newStr += count.toString(i);
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        String str = "aaaabbccdd";
        String str5 = "abcd";
        System.out.println(Compression(str));
        System.out.println(Compression(str5));
    }
}
//TC-O(n)
// while and for will take same i++;
// o/p -->a3b2c2d2