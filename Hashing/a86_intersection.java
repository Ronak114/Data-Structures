import java.util.HashSet;

public class a86_intersection {
    public static void main(String[] args) {
        int a1[] = { 7, 3, 9 };
        int a2[] = { 6, 3, 9, 2, 9, 4 };

        // mine
        // HashSet<Integer> hs = new HashSet<>();
        // HashSet<Integer> hs1 = new HashSet<>();

        // for (int i = 0; i < a1.length; i++) {
        // hs.add(a1[i]);
        // }

        // for (int i = 0; i < a2.length; i++) {
        // if (hs.contains(a2[i])) {
        // hs1.add(a2[i]);
        // }
        // }
        // System.out.println(hs1);
        // System.out.println(hs1.size());

        // mam
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < a1.length; i++) {
            hs.add(a1[i]);
        }

        int count = 0;
        for (int i = 0; i < a2.length; i++) {
            if (hs.contains(a2[i])) {
                count++;
                System.out.print(a2[i] + " ");
                hs.remove(a2[i]);
            }
        }
        System.out.println();
        System.out.println("No of intersected ele : " + count);
        // in this heapset all the intersection ele will be removed.
        System.out.println("final set " + hs + " size " + hs.size());
    }
}
