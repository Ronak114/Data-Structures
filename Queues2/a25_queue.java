// Queue implementation using array..TC O(1).
public class a25_queue {

    static class Queue {
        static int arr[]; // array.
        static int size;// size of arr.
        static int rear;
        static int front;

        Queue(int n) { // constructor.
            arr = new int[n]; // size of arr.
            size = n;
            rear = -1;
            front = -1;
        }

        // isempty
        public static boolean isempty() {
            return rear == -1 && front == -1;
        }

        // full
        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // add
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            // add 1st element.
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // remove.
        public static int remove() {
            if (isempty()) {
                System.out.println("queue empty");
                return -1;
            }

            int result = arr[front];
            // front = (front + 1) % size;

            //last ele delete
            if(rear == front){
                rear = front =-1;
            }else{
                front = (front+1)%size;
            }
            return result;
        }

        // peek
        public static int peek() {
            if (isempty()) {
                System.out.println("queue empty");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while (!q.isempty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
