public class a5_llKunal {

    // reference var pointing to the nodes
    private Node head;
    private Node tail;

    // var to take size
    private int size;

    // need for this??
    public a5_llKunal() {
        this.size = 0;
    }

    public void insertFirst(int data) {
        // take value/data
        Node node = new Node(data);
        // set next to head ka next
        node.next = head;
        // update head
        head = node;

        // single node condn
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void display() {
        Node temp = head;

        // temp ke uper khel rahe hai.
        while (temp != null) {
            System.out.print(temp.data + "->");
            // to update
            temp = temp.next;
        }
        System.out.println("null");
    }

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        a5_llKunal list = new a5_llKunal();
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(5);
        list.display();

    }
}
