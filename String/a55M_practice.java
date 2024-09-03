import java.util.Scanner;

public class a55M_practice {
    // how many times lowercase occured in a string entered bt user
    public static int countLowCase(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>=97) && (s.charAt(i)<=122)){
                count++;
            }
        }
        return count;
    }

    // Q.convert each first letter into uppercase.
    // "hello wORLD" o/p:Hello WORLD
    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        /*****************REMEMBER****************** */
        // String s=new Scanner(System.in).nextLine();
        System.out.println(countLowCase(s));

        // op : ApnaCoeege
        String p = "ApnaCollege".replace("l","");
        System.out.println(p);

        String str = "hello worLD";
        System.out.println(toUpperCase(str));
    }
}
// TC O(n)
