// Queue implementation using LinkedList..TC O(1).
public class a26_queueeLL {
    // node class for LL.
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        // isempty
        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // no need to check full condn as we can add as many we want.

        // add....TC O(1).
        public void add(int data) {
            // create new node
            Node newNode = new Node(data);

            // 1st ele ko add krna
            if (head == null) {
                head = tail = newNode;
                return;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // remove.....TC O(1).
        public static int remove() {
            if (isEmpty()) {
                System.out.println("queue empty");
                return -1;
            }

            int front = head.data;
            // single ele delete
            if (tail == head) {
                head = tail = null;
            } else {
                head = head.next;
            }
            return front;
        }

        // peek....TC O(1).
        public static int peek() {
            if (isEmpty()) {
                System.out.println("queue empty");
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
