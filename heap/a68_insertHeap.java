import java.util.ArrayList;

public class a68_insertHeap {
    static class Heap {

        // ADD
        public void add(ArrayList<Integer> al, int data) {
            // step 1 : add at last position
            al.add(data);

            // step 2 : fix the position
            int x = al.size() - 1; // x is child idx.
            int par = (x - 1) / 2; // parent's idx

            // compare
            while ( al.get(x) < al.get(par)) { // O(logn) n-nodes,logn - height
                // MAX - HEAP (>)
                // swap
                int temp = al.get(x);
                al.set(x, al.get(par));
                al.set(par, temp);

                // Update indices
                x = par;
                par = (x - 1) / 2;
            }

            // print heap.
            for (int i = 0; i <= al.size() - 1; i++) {
                System.out.print(al.get(i) + " ");
            }
        }

        // PEEK
        public void peek(ArrayList<Integer> al) {
            System.out.println(al.get(0));
        }

        //HEAPIFY - O(logn)
        private void heapify(ArrayList<Integer> al, int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i; // MAX - HEAP maxIdx

            if (left < al.size() && al.get(minIdx) > al.get(left)) { // MAX - HEAP 2nd wla(<)
                minIdx = left;
            }

            if (right < al.size() && al.get(minIdx) > al.get(right)) { // MAX - HEAP 2nd wla(<)
                minIdx = right;
            }

            if (minIdx != i) {
                // swap
                int temp = al.get(i);
                al.set(i, al.get(minIdx));
                al.set(minIdx, temp);

                heapify(al, minIdx);
            }
        }

        // DELETE O(logn)
        public int delete(ArrayList<Integer> al) {
            int data = al.get(0);

            // step 1 : swap 1st and last
            int temp = al.get(0);
            al.set(0, al.get(al.size() - 1));
            al.set(al.size() - 1, temp);

            // step 2:delete last
            al.remove(al.size() - 1);

            // step 3 : heapify
            heapify(al, 0);
            // print heap.
            for (int i = 0; i <= al.size() - 1; i++) {
                System.out.print(al.get(i) + " ");
            }
            return data;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> all = new ArrayList<>();

        // initializing some values
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(10);

        h.add(al, 1);
        System.out.println();
        h.peek(al);

        all.add(2);
        all.add(3);
        all.add(4);
        all.add(5);
        all.add(10);
        all.add(6);
        h.delete(all);

    }
}
