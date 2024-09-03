import java.util.HashSet;

public class a85_union {
    public static void main(String[] args) {
        int a1[] = { 7, 3, 9 };
        int a2[] = { 6, 3, 9, 2, 9, 4 };

        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < a1.length; i++) {
            hs.add(a1[i]);
        }

        for (int i = 0; i < a2.length; i++) {
            hs.add(a2[i]);
        }

        System.out.println(hs);
        System.out.println(hs.size());
    }
}