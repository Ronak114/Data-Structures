public class a84_NQueens {
    // n queens in n rows(avoid attacking scene)

    public static void nQueens(char board[][], int row) {
        // base case
        if (row == board.length) {
            printBoard(board);
            return;
        }

        // column loop
        for (int j = 0; j < board.length; j++) {
            board[row][j] = 'Q';// q ko bhithaya
            nQueens(board, row + 1);// funtn call
            board[row][j] = '.';// backtracking step //q ko uthaya ..col mai baith jayenge islye
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("-----------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];
        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        nQueens(board, 0);
    }
}
