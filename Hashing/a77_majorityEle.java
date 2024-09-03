import java.util.HashMap;
import java.util.Set;

public class a77_majorityEle {
    public static void main(String[] args) {
        int nums[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };

        HashMap<Integer, Integer> hm = new HashMap<>();

        // loop to store num and freq in hashtable
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            // // if map already contain key
            // if (hm.containsKey(num)) {
            //     hm.put(num, hm.get(num) + 1);
            // }
            // // if not then add
            // else {
            //     hm.put(num, 1);
            // }

            // shortcut
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        Set<Integer> key = hm.keySet();
        for (Integer i : key) {
            if (hm.get(i) > nums.length / 3) {
                System.out.println(i);
            }
        }

        //shortcut
        // for (Integer i : hm.keySet()) {
        //     if (hm.get(i) > nums.length / 3) {
        //         System.out.println(i);
        //     }
        // }
    }
}
