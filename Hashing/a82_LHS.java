import java.util.*;

public class a82_LHS {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Pune");
        set.add("banglore");
        set.add("mumbai");
        set.add("noida");
        set.add("indore");
        System.out.println(set);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Pune");
        lhs.add("bangaluru");
        lhs.add("mumbai");
        lhs.add("noida");
        lhs.add("indore");
        System.out.println(lhs);

        lhs.remove("pune"); // case sensitive pune != Pune
        System.out.println(lhs);
    }
}
