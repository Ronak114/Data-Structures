public class a52_stringComparison {
    // ==...will check at object level(address + content)
    // to check values..we use funtn like .equals
    public static void main(String args[]) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if (s1 == s2) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
        // o/p equal.
        // actually both s1 and s2 are pointing towards the same name tony.

        if (s3 == s2) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
        // o/p not equal.
        // bcz when we create a string from new keyword it will create new
        // tony.therefore it will not be equal.

        //equals function....return a boolean type
        if(s1.equals(s3)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
