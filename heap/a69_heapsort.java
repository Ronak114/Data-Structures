public class a69_heapsort { // O(nlogn)
    public static void heapSort(int a[]) {
        // step 1 : build maxHEap.
        int n = a.length;
        for (int i = n / 2; i >= 0; i--) {
            heapify(a, i, n);
        }
        // step 2 : largest at the end.
        for (int i = n - 1; i > 0; i--) {
            // swap
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            heapify(a, 0, i);
        }
    }

    public static void heapify(int a[], int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIdx = i;

        // if (left < size && a[left] > a[maxIdx]) {
        if (left < size && a[left] < a[maxIdx]) { // descending
            maxIdx = left;
        }

        // if (right < size && a[right] > a[maxIdx]) {
        if (right < size && a[right] < a[maxIdx]) { // descending
            maxIdx = right;
        }

        if (maxIdx != i) {
            // swap
            int temp = a[i];
            a[i] = a[maxIdx];
            a[maxIdx] = temp;

            heapify(a, maxIdx, size);
        }

    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 4, 5, 3 };
        heapSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " "); // ascending order
        }
    }
}
