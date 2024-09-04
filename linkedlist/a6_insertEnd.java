public class a6_insertEnd {
    private Node head;
    private Node tail;

    // // var to take size
    // private int size;

    // // need for this??
    // public a5_llKunal() {
    // this.size = 0;
    // }

    public void insertFirst(int data) {
        // create node
        Node node = new Node(data);
        // node.data=data; // no jarurat
        // node.next=null; // not the end
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void insertEnd(int data) {
        if (tail == null) {
            insertFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
    }

    public class Node {
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
        a6_insertEnd list = new a6_insertEnd();
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(5);
        list.display();
        list.insertEnd(100);
        list.display();
    }
}