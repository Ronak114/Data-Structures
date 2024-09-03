import java.util.ArrayList;

public class a95_waterStored {
    // // brute force -> O(n^2).
    // public static int bruteforce(ArrayList<Integer> h){
    // int max=Integer.MIN_VALUE;
    // for(int i=0;i<h.size();i++){
    // for(int j=i+1;j<h.size();j++){
    // int ht=Math.min(h.get(i),h.get(j));
    // int width=j-i;
    // int watstored = ht*width;
    // if(watstored>=max){
    // max=watstored;
    // }
    // // max = Math.max(watstored,max);
    // }
    // }
    // return max;
    // }

    // optimised way-2 pointer-->tc O(n)
    public static int StoredWat(ArrayList<Integer> h) {
        int lp = 0;
        int rp = h.size() - 1;
        int max = Integer.MIN_VALUE;
        while (lp < rp) {
            int ht = Math.min(h.get(lp), h.get(rp));
            int width = rp - lp;
            int watstored = ht * width;
            max = Math.max(max, watstored);

            //update pointer.                                        
            if (h.get(lp) < h.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        // 1,8,6,2,5,4,8,3,7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        // System.out.println(bruteforce(height));
        System.out.println(StoredWat(height));
    }
}
