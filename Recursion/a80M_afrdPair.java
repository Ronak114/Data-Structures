public class a80M_afrdPair {
    public static int pairingfrd(int n){
        //base case
        if(n==1 || n==2){
            return n;
        }
        // //kaam
        // //single
        // int fnm1 = pairingfrd(n-1) ;
        // //pair
        // int fnm2 = (n-1)*pairingfrd(n-2);
        // return fnm1 + fnm2;

        return pairingfrd(n-1) + (n-1)*pairingfrd(n-2);
    }
    public static void main(String[] args) {
       System.out.println(pairingfrd(3));
    }
}
