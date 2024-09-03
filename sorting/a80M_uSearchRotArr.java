public class a80M_uSearchRotArr {
    public static int SearchRotateArr(int[] arr, int key, int si, int ei) {
        //base case
        if(si>ei){
            return -1;
        }
        // kaam
        int mid = si + (ei - si) / 2;

        // case found
        if (arr[mid] == key) {
            return mid;
        }
        // mid on L1
        if (arr[si] <= arr[mid]) {
            // case a:left
            if (arr[si] <= key && key <= arr[mid]) {
                return SearchRotateArr(arr, key, si, mid - 1);
            }
            // case b: right
            else {
                return SearchRotateArr(arr, key, mid + 1, ei);
            }
        }
        // mid on L2
        else {
            // case c:right
            if (arr[mid] <= key && key <= arr[ei]) {
                return SearchRotateArr(arr, key, mid + 1, ei);
            }
            // case d: right
            else {
                return SearchRotateArr(arr, key, si, mid-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
       System.out.println(SearchRotateArr(arr, 0, 0, arr.length - 1));

    }
}