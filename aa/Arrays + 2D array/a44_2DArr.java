import java.util.*;

public class a44_2DArr {
    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == key){
                    System.out.println("found at (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("not found");
        return false;
    }

    public static void main(String args[]) {
        // creation.
        int matrix[][] = new int[3][3]; // every place will store 0 value.
        // n*m.
        /*********remenber********** */
        int n = matrix.length;// =3....rows
        int m = matrix[0].length;// =3...col

        // input.
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // it will take many inputs...but will print in range.

        // output.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // search.
        search(matrix, 9);

    }
}
//hw print largest and smallest no from array.
