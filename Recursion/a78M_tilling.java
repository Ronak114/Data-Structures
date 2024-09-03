public class a78M_tilling {
    public static int tilling(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }

        //kaam
        //vertical choice
        int fnm1 = tilling(n-1);
        //horizontal choice
        int fnm2 = tilling(n-2);

        return fnm1 + fnm2;
    }
    public static void main(String[] args) {
       System.out.println(tilling(3));
       System.out.println(tilling(2));
       System.out.println(tilling(4));
    }
}
