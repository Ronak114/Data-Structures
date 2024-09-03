public class a52_substring {
    public static String SUBString(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    // this funtn is user-defined..but we already have it in java
    public static void main(String args[]) {
        String s1 = "HelloWorld";
        System.out.println(SUBString(s1, 0, 4));
        //substring funtn.
        System.out.println(s1.substring(0, 5));
    }
}
