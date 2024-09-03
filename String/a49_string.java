import java.util.*;

public class a49_string {
    // Strings(user-defined) and String(inbuilt) are different.
    public static void main(String args[]) {
        char arr[] = { 'a', 'b', 'c' };// ex. of array

        // defining a string.(invoking String class)
        String str = "abcd";
        String str1 = new String("xyz");

        // String are IMMUTABLE (does not change)

        // //input
        // Scanner sc=new Scanner(System.in);
        // String name=sc.next();//takes single word.
        // System.out.println(name);
        // String name1=sc.nextLine();//takes the whole line
        // System.out.println(name1);

        // length function(counts space)
        String fullName1 = "Ronak Pawar";
        System.out.println(fullName1.length());

        // Concatenation
        String firstName = "ronak";
        String lastName = "Pawar";
        String FULLNAME = firstName + " " + lastName;
        System.out.println(FULLNAME);

        // to select a certain letter.
        System.out.println(FULLNAME.charAt(0));
        System.out.println();
        printLetters(FULLNAME);
    }

    // function to print each letter.
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
