import java.util.*;

public class a81_hashsetIteration {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(4);
        hs.add(2);
        hs.add(5);
        hs.add(50);
        hs.add(3);

        // unordered.
        Iterator i = hs.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        System.out.println();

        HashSet<String> set = new HashSet<>();
        set.add("Pune");
        set.add("banglore");
        set.add("mumbai");
        set.add("noida");
        set.add("indore");

        // // unordered.
        // Iterator it = set.iterator();
        // while (it.hasNext()) {
        // System.out.print(it.next() + " ");
        // }

        // advance loops
        for (String k : set) {
            System.out.println(k);
        }

    }
}
