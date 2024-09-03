// Queue implementation using array
public class a24_ArrQue {
    static class Queue {
        static int arr[]; // array.
        static int size;// size of arr.
        static int rear;

        Queue(int n) { // constructor.
            arr = new int[n]; // size of arr.
            size = n;
            rear = -1;
        }

        // isempty
        public static boolean isempty() {
            return rear == -1;
        }

        // add
        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            } else {
                rear += 1;
                arr[rear] = data;
            }
        }

        // remove.
        public static int remove() {
            if (isempty()) {
                System.out.println("queue empty");
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear -= 1;
            return front;
        }

        // peek
        public static int peek() {
            if (isempty()) {
                System.out.println("queue empty");
                return -1;
            }

            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(12);
        q.add(13);

        while (!q.isempty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
