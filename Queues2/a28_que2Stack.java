import java.util.Stack;

// Stack using 2 queue
// with add O(n),remove O(1),pop O(1).
// hw -> remove O(n),peek O(n),add O(1).
public class a28_que2Stack {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        // isEmpty(
        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // add...TC O(n)
        public static void add(int data) {
            // s1 -> s2.
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            // push in s1.
            s1.push(data);

            // s2 -> s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // remove..TC O(1)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return s1.pop();
        }

        // peek...TC O(1)
        public static int peek() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue() ;
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
