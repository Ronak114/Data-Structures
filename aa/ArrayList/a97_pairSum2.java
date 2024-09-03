import java.util.ArrayList;
import java.util.Arrays;

public class a97_pairSum2 {
    public static boolean printSum(ArrayList<Integer> l, int tar) {
        // find breaking pt
        int bp = -1;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) > l.get(i + 1)) {
                bp = i;
                break;
            }
        }

        int lp = bp + 1;// smallest
        int rp = bp; // largest
        while (lp != rp) {
            // case 1
            if (l.get(lp) + l.get(rp) == tar) {
                return true;
            }
            // case 2
            else if (l.get(lp) + l.get(rp) < tar) {
                lp = (lp + 1) % l.size();
            }
            // case 3
            else {
                rp = (rp + l.size() - 1) % l.size();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(11, 15, 6, 8, 9, 10));
        int target = 1600;
        System.out.println(printSum(l, target));

    }
}
