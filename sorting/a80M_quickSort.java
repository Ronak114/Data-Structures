public class a80M_quickSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int si, int ei) {
        //base case
        if(si>=ei){
            return;
        }
        // pivot = last element
        int pi_idx = partition(arr, si, ei);
        quickSort(arr, si, pi_idx - 1);// left
        quickSort(arr, pi_idx + 1, ei);// right
    }

    public static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;// to make places for element smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        i++;
        // final wla add.
        int t = pivot;
        arr[ei] = arr[i];//pivot = arr[i]..idx store krna hai 
        arr[i] = t;
        return i;//pid return kr denga.
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 2, 5, 1, 0, -2 };
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
