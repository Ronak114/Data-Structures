public class a74M_fibonacci {
    // Print n fibbonacci number
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        /******** Another Way******** */
        // int fnm1=fib(n-1);
        // int fnm2=fib(n-2);
        // int fn=fnm1+fnm2;
        // return fn;
        return (fib(n - 2) + fib(n - 1));
    }

    public static void main(String args[]) {
        System.out.println(fib(25));
        System.out.println(fib(5));
        System.out.println(fib(8));
    }
}
