import java.util.LinkedHashMap;
import java.util.Set;

public class a75_LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        // // put - O(1).
        // lhm.put("India", 100);
        // lhm.put("Sri lanka", 90);
        // lhm.put("Russia", 99);
        // lhm.put("Japan", 10);

        // System.out.println(lhm);
        // // ordered as insertion

        // //get - O(1).
        // System.out.println(lhm.get("India"));
        // System.out.println(lhm.get("Bharat")); // key not exist ,therefore null op.

        // // Contains - O(1).
        // System.out.println(lhm.containsKey("India"));
        // System.out.println(lhm.containsKey("Bharat"));

        // // remove - O(1)
        // lhm.remove("Russia");
        // System.out.println(lhm);
        // lhm.remove("china"); // return null value
        // System.out.println(lhm);

        // // size
        // System.out.println(lhm.size());

        // // isEmpty
        // System.out.println(lhm.isEmpty());

        // // clear
        // lhm.clear();
        // System.out.println(lhm);

        /********* Iteration of hashMAp ********/
        lhm.put("India", 100);
        lhm.put("china", 99);
        lhm.put("Sri lanka", 90);
        lhm.put("Russia", 99);
        lhm.put("Japan", 10);

        System.out.println(lhm);

        // import Set
        Set<String> keyss = lhm.keySet();
        System.out.println(keyss);
        for (String k : keyss) {
            System.out.println("Key :" + k + "," + " Value :" + lhm.get(k));
        }
    }
}
