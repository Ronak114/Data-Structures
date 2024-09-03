public class a48M_practice {
    // count n occurs in a 2d-array.
    public static int countNO(int[][] a, int n) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (n == a[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    // print sum of 2nd row of array.
    public static int printSum(int a[][]) {
        int sum = 0;
        for (int j = 0; j < a[0].length; j++) {
            sum += a[1][j];
        }
        return sum;
    }

    // Transpose.
    public static void Transpose(int a[][]) {
        // print original matrix.
        printArr(a);

        // transpose.
        int[][] tranposeMAt = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                tranposeMAt[j][i] = a[i][j];
            }
        }
        printArr(tranposeMAt);
    }

    // print array
    public static void printArr(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] array = { { 4, 7, 8 }, { 8, 8, 7 } };
        // System.out.println(countNO(array, 8));

        int[][] arr = { { 1, 4, 9 }, { 11, 4, 3 }, { 1, 1, 1 }, { 2, 2, 3 } };
        System.out.println(printSum(arr));
        System.out.println();

        int[][] tra = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        Transpose(tra);
    }
}
