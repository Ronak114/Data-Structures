import java.util.*;

public class a33_dequeJCF {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addFirst(4);
        deque.addFirst(5);
        System.err.println(deque); // [3,2,1]
        deque.remove(); // by deafult first ko remove krta.
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
        deque.addLast(8);
        deque.addLast(9);
        deque.addLast(10);
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);

        System.out.println("1st ele : " + deque.getFirst());
        System.out.println("last ele : " + deque.getLast());
    }
}
