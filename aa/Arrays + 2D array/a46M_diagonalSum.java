public class a46M_diagonalSum {
    public static int diagonalSum(int matrix[][]) { // TC O(n^2). brute force.Z
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                // // primary
                // if (i == j) {
                //     sum += matrix[i][j];
                // }
                // // secondary
                // else if (i + j == matrix.length - 1) {
                //     sum += matrix[i][j];
                // }

                // mine
                if (i == j || i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    // more optimized code.
    public static int DS(int matrix[][]) { // TC O(n).
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // primary
            sum += matrix[i][i];
            // secondary
            if (i != matrix.length - 1 - i)// overlapping condn.
                sum += matrix[i][matrix.length - 1 - i];// i+j=n-1.....j=n-1-i.
        }
        return sum;
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println(diagonalSum(matrix));
        System.out.println(DS(matrix));
    }
}
