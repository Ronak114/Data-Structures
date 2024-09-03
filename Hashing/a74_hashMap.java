import java.util.HashMap;
import java.util.Set;

public class a74_hashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // // put - O(1).
        // hm.put("India", 100);
        // hm.put("Sri lanka", 90);
        // hm.put("Russia", 99);
        // hm.put("Japan", 10);

        // System.out.println(hm);
        // // order is not same why?
        // // bcz it is not ordered collection if want change to treeMap or
        // LinkedHashMap

        // // get - O(1).
        // System.out.println(hm.get("India"));
        // System.out.println(hm.get("Bharat")); // key not exist ,therefore null op.

        // // Contains - O(1).
        // System.out.println(hm.containsKey("India"));
        // System.out.println(hm.containsKey("Bharat"));

        // // remove - O(1)
        // hm.remove("Russia");
        // System.out.println(hm);
        // hm.remove("china"); // return null value
        // System.out.println(hm);

        // // size
        // System.out.println(hm.size());

        // // isEmpty
        // System.out.println(hm.isEmpty());

        // // clear
        // hm.clear();
        // System.out.println(hm);

        /********* Iteration of hashMAp ********/
        hm.put("India", 100);
        hm.put("china", 99);
        hm.put("Sri lanka", 90);
        hm.put("Russia", 99);
        hm.put("Japan", 10);

        System.out.println(hm);

        // import Set
        Set<String> keyss = hm.keySet();
        System.out.println(keyss);
        for (String k : keyss) {
            System.out.println("Key :" + k + "," + " Value :" + hm.get(k));
        }
    }
}
