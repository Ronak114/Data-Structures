public class a59D_oopow2 {
    // check no is power of 2 or not..
    public static boolean IsPowOf2(int n) {
        return ((n & (n - 1)) == 0);
    }

    // Count set bits
    public static int countBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    // Fast Exponentiation
    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }
    // TC:log(n)

    public static void main(String[] args) {
        int n = 6;
        System.out.println(IsPowOf2(n));
        System.out.println(countBits(8));
        System.out.println(fastExpo(3, 5));
    }

}
