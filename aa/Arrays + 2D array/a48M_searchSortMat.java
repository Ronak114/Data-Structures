public class a48M_searchSortMat {
    public static boolean staircaseSearch(int matrix[][], int key) {
        // int row = 0, col = matrix[0].length - 1;

        // // top-right case
        // while (row < matrix.length && col >= 0) {
        //     if (matrix[row][col] == key) {
        //         System.out.println("found at (" + row + "," + col + ")");
        //         return true;
        //     }

        //     else if (key < matrix[row][col]) {
        //         col--;
        //     } else {
        //         row++;
        //     }
        // }
        // System.out.println("Key not found");
        // return false;

        // bottom-left case
        int row = matrix.length - 1, col = 0;
        while (row >= 0 && col < matrix.length) {
            if (matrix[row][col] == key) {
                System.out.println("found at (" + row + "," + col + ")");
                return true;
            }

            else if (key < matrix[row][col]) {
                row--;
            } else {
                col++;
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String args[]) {
        // sorted matrix.
        // row<nxt roe elem ..||y for col
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        int key = 30;
        staircaseSearch(matrix, key);
    }
}// TC Depends on n and m
 // n>>>m.....O(n)
 // m>>>>n.....O(m)
 // O(m+n)
 // hw..conside 2nd case..mention in copy.