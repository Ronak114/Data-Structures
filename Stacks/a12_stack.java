//stack implementation by arraylist.

import java.util.ArrayList;

public class a12_stack {

    static class Stack { // why we have used static here?
        static ArrayList<Integer> list = new ArrayList<>(); // same static??

        // Check for empty stack
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push funtn
        public static void push(int data) {
            list.add(data);
        }

        // pop
        public static int pop() {
            // corner condn
            if (isEmpty()) {
                return -1;
            } else {
                int top = list.get(list.size() - 1); // get the top TC-O(1)
                list.remove(list.size() - 1); // remove the top
                return top;
            }
        }

        // peek
        public static int peek() {
            // corner condn
            if (isEmpty()) {
                return -1;
            } else {
                int top = list.get(list.size() - 1);
                return top;
            }
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}