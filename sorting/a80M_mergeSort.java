public class a80M_mergeSort {
    // to print array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void MergeSort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }
        // kaam
        int mid = si + (ei - si) / 2;
        MergeSort(arr, si, mid);// left
        MergeSort(arr, mid + 1, ei); // Right

        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        // left(0,3)=4 right(4,6)=3-->6-0+1=7
        int temp[] = new int[ei - si + 1];
        int i = si;// iterator for left part
        int j = mid + 1;// iterator for right part
        int k = 0;// iterator for temp array

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // if something left in left part..but empty in right side
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // if something right in left part..but empty in left side
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
    public static void main(String args[]) {
        int arr[] = { 6, 3, 2, 5, 1, 0, -2 };
        MergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
