public class a77M_xn {
    // print x^n
    public static int printXN(int x, int n) {
        // base case
        if (n == 0) {
            return 1;
        }
        return x * printXN(x, n - 1);
    }

    // optimised soln
    public static int optXN(int x, int n) {
        // base case
        if (n == 0) {
            return 1;
        }

        // int halfPowerSq = optXN(x, n / 2) * optXN(x, n / 2); // TC-O(n)
        int halfPower = optXN(x, n / 2);
        int halfPowerSq = halfPower * halfPower;

        // n = odd
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String args[]) {
        System.out.println(printXN(2, 10));
        System.out.println(optXN(2, 10));
    }
}
