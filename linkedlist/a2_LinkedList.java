import java.util.LinkedList;

public class a2_LinkedList {
    // creating a node class.
    public static class Node { // node class
        int data;
        Node next; // reference var

        public Node(int data) { // constructor
            this.data = data;
            this.next = null; // assuming next node will be null
        }
    }

    // properties...here both head and tail are of node type
    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
        a2_LinkedList ll = new a2_LinkedList(); // obj of same class

        //in next code we will write methods to add no in ll.
        ll.head = new Node(1);
        ll.head.next = new Node(2);

    }
}
