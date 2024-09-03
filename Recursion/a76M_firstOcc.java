public class a76M_firstOcc {
    // first occurenec
    public static int firstOccurence(int[] a, int i, int k) {
        // base case
        if (i == a.length - 1) {
            return -1;
        }
        if (k == a[i]) {
            return i;
        }
        return firstOccurence(a, i + 1, k);
    }

    // last occurence
    public static int lastOcc(int[] a, int i, int k) {
        // base case
        if (i == a.length) {
            return -1;
        }

        int isFound = lastOcc(a, i + 1, k);
        if (isFound == -1 && k == a[i]) {
            return i;
        }
        return isFound;
    }

    public static void main(String args[]) {
        int[] arr = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        System.out.println(firstOccurence(arr, 0, 5));
        System.out.println(lastOcc(arr, 0, 5));
    }
}
