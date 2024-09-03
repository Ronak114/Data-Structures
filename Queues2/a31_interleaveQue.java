import java.util.*;

public class a31_interleaveQue {
    public static void interleaveQueue(Queue<Integer> q) {
        // first half queue.
        Queue<Integer> q1 = new LinkedList<>();
        int size = q.size();

        // first half -- take from q remove and add it to q1.
        for (int i = 0; i < size / 2; i++) {
            q1.add(q.remove());
        }

        // take ele from both queue.
        while (!q1.isEmpty()) {
            q.add(q1.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        // original queue.
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interleaveQueue(q);

        // printing queue
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
