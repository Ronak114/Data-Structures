import java.util.Comparator;
import java.util.PriorityQueue;

public class a65_PriorityQue {
    public static void main(String[] args) {
        // class ke obj bhi store kr skte.

        // ascending order
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // add
        pq.add(3); // O(log n)
        pq.add(1);
        pq.add(9);
        pq.add(4);
        pq.add(8);

        // print
        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " "); // O(1);
            pq.remove(); // O(log n)
        }

        System.out.println();

        // descending order
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());

        pq1.add(3); // O(log n)
        pq1.add(1);
        pq1.add(9);
        pq1.add(4);
        pq1.add(8);

        // print
        while (!pq1.isEmpty()) {
            System.out.print(pq1.peek() + " "); // O(1);
            pq1.remove(); // O(log n)
        }
    }
}
