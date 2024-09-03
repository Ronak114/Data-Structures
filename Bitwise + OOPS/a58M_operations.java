import java.util.*;

public class a58M_operations {
    // get the ith bit.
    public static int GetBit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // Set the ith bit
    public static int SetBit(int n, int i) {
        int bitmask = 1 << i;
        return (n | bitmask);
    }

    // Clear the ith bit.
    public static int clearBit(int n, int i) {
        int bitmask = ~(1 << i);
        return (n & bitmask);
    }

    // Update ith bit..newbit will bw mentioned
    public static int UpdateBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        // return clearBit(n, i);
        // } else {
        // return SetBit(n, i);
        // }

        // another way (bot have same complexity)
        n = clearBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
        /*********REMEMBER*********** */
        // 1.first clear bit 2.newBit ko shift kiya(1/0 will be shifted 3.then take or(0 ka or =0 1 ke sath ,bit will be set))
    }

    // Clear last i bits
    public static int clearIBit(int n, int i) {
        int bitMask = (~0) << i;
        return (n & bitMask);
    }

    //clear range of bits
    public static int clearIBitsRange(int n,int i,int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitMask=a |b;
        return n & bitMask;
    }

    public static void main(String args[]) {
        System.out.println(GetBit(10, 2));
        System.out.println(SetBit(10, 2));
        System.out.println(clearBit(10, 1));
        System.out.println(UpdateBit(10, 2, 1));
        System.out.println(clearIBit(15, 2));
        System.out.println(clearIBitsRange(2515, 2,7));
        // o/p=decimal.
    }
}
