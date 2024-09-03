import java.util.Scanner;
// Largest No in 2D array.

public class a44_largestNo {
    public static int largest(int a[][]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            for (int j = 0; j < a[0].length; j++) {
                if(a[i][j]>max){
                    max=a[i][j];
                }
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("max:" + largest(matrix));
    }
}
