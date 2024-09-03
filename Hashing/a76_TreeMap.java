import java.util.TreeMap;
import java.util.Set;

public class a76_TreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();

        // put - O(1).
        tm.put("India", 100);
        tm.put("Sri lanka", 90);
        tm.put("Russia", 99);
        tm.put("Japan", 10);

        System.out.println(tm);
        // order is sorted.

        //get - O(1).
        System.out.println(tm.get("India"));
        System.out.println(tm.get("Bharat")); // key not exist ,therefore null op.

        // Contains - O(1).
        System.out.println(tm.containsKey("India"));
        System.out.println(tm.containsKey("Bharat"));

        // remove - O(1)
        tm.remove("Russia");
        System.out.println(tm);
        tm.remove("china"); // return null value
        System.out.println(tm);

        // size
        System.out.println(tm.size());

        // isEmpty
        System.out.println(tm.isEmpty());

        // clear
        tm.clear();
        System.out.println(tm);
        System.out.println();

        /********* Iteration of hashMAp ********/
        tm.put("India", 100);
        tm.put("Sri lanka", 90);
        tm.put("Russia", 99);
        tm.put("Japan", 10);

        System.out.println(tm);

        // import Set
        Set<String> keyss = tm.keySet();
        System.out.println(keyss);
        for (String k : keyss) {
            System.out.println("Key :" + k + "," + " Value :" + tm.get(k));
        }
    }
}
