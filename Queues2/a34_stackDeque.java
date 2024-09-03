import java.util.*;

public class a34_stackDeque {
    static class stk {
        Deque<Integer> deque = new LinkedList<>();

        // push
        public void push(int data) {
            deque.addLast(data);
        }

        // pop
        public int pop() {
            return deque.removeLast();
        }

        // peek
        public int peek() {
            return deque.getLast();
        }
    }

    public static void main(String[] args) {
        stk s = new stk();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println(s.peek());
        System.out.println();
        System.err.println(s.pop());
        System.err.println(s.pop());
        System.err.println(s.pop());
        System.err.println(s.pop());
    }
}
