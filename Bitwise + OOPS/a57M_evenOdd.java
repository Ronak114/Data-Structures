public class a57M_evenOdd {
    // Q.Check no.is even or odd.
    public static void evenOrOdd(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {// even
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public static void main(String args[]) {
        evenOrOdd(3);
        evenOrOdd(30);
     
    }
}
