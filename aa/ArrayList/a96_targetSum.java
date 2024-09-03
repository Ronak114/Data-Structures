import java.util.ArrayList;

public class a96_targetSum {
    // Brute force
    // array is sorted iss ka toh use he nhi kiya.
    public static boolean printSum(ArrayList<Integer> l, int tar) {
        for (int i = 0; i < l.size(); i++) {
            for (int j = i + 2; j < l.size(); j++) {
                if (l.get(i) + l.get(j) == tar) {
                    return true;
                }
            }
        }
        return false;
    }

    // 2-pointer approach
    public static boolean retSum(ArrayList<Integer> l, int target) {
        int lp = 0;
        int rp = l.size() - 1;
        while (lp != rp) {
            if (l.get(lp) + l.get(rp) == target) {
                return true;
            } else if (l.get(lp) + l.get(rp) < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 1,2,3,4,5,6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        System.out.println(printSum(list, target));
        System.out.println(retSum(list, target));

    }
}
