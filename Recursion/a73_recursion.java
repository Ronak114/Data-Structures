public class a73_recursion {
    // print no from n to 1(decreasing order)
    public static void printNo(int n) {
        if (n == 1) {
            System.out.println(n);
            return;//if else use krenge then no need to use return.
        }
        System.out.print(n + " ");
        printNo(n - 1);
        // printNo(--n);// will work but n-- will not
    }

    // print no from 1 to n(increasing order)
    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    // print factorial of no.n
    public static int printFact(int m) {
        if (m == 0) {
            return 1;
        }
        // int fn=m * printFact(m-1);
        // return fn;

        // another way.
        return m * printFact(m - 1);
    }
    
    //print sum of n no.
    public static int printSum(int p){
        //p==0..return 0 (ye bhi chl jata)
        if(p==1){
            return 1;
        }
        return p + printSum(p-1);
    }

    public static void main(String args[]) {
        printNo(10);
        printInc(5);
        System.out.println(printFact(5));
        System.out.println(printSum(5));
    }
}
