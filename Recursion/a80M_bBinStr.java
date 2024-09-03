public class a80M_bBinStr {
    public static void printBinStr(int n, int lastPlace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // kaam
        // 0
        printBinStr(n - 1, 0, str+"0");
        if (lastPlace == 0) {
            printBinStr(n - 1, 1, str+ "1");
        }
    }

    public static void main(String[] args) {
        printBinStr(3, 0, "");
    }
}
