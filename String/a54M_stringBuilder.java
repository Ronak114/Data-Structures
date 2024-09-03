public class a54M_stringBuilder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch < 'z'; ch++) {
            sb.append(ch);// append funtn to add ch from behind.
        }
        System.out.println(sb);
    }
}
// TC O(26).
// nd for += case O(n*n)
// has similar funtn as string....sb.length();