import java.util.*;

public class a35_queDeque {

    static class qu {
        Deque<Integer> deque = new LinkedList<>();

        // add
        public void add(int data) {
            deque.addLast(data);
        }

        // remove
        public int remove() {
            return deque.removeFirst();
        }

        // peek
        public int peek() {
            return deque.getFirst();
        }
    }

    public static void main(String[] args) {
        qu s = new qu();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);

        System.out.println(s.peek());
        System.out.println();
        System.err.println(s.remove());
        System.err.println(s.remove());
        System.err.println(s.remove());
        System.err.println(s.remove());
    }
}
