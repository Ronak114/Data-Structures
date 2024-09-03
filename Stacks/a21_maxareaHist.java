import java.util.*;

public class a21_maxareaHist {
    // TC ->O(n).
    public static void maxArea(int arr[]) {
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        // Next Smaller Right TC ->O(n).
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // Next Smaller Left TC ->O(n).
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // current area TC ->O(n).
        for (int i = 0; i < arr.length; i++) {
            int ht = arr[i];
            int wdt = nsr[i] - nsl[i] - 1;
            int currArea = ht * wdt;
            maxArea = Math.max(currArea, maxArea);
        }

        System.out.println(maxArea);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 }; // hts of histogram.
        maxArea(arr);
    }
}
