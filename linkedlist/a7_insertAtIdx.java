public class a7_insertAtIdx {
    private Node head;
    private Node tail;
    private int size;

    // need for this??
    public a7_insertAtIdx() {
        this.size = 0;
    }

    public void insertFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        size++;

        if (tail == null) {
            tail = head;
        }
    }

    public void insertEnd(int data) {
        if (tail == null) {
            insertFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAtIdx(int data, int idx) {
        if (idx == 0) {
            insertFirst(data);
            return;
        }
        if (idx == size) {
            insertEnd(data);
            return;
        }

        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        Node node = new Node(data, temp.next);
        temp.next = node;
        size++;

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println(size);
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
        a7_insertAtIdx list = new a7_insertAtIdx();
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(5);
        list.display();
        list.insertEnd(100);
        list.display();
        list.insertAtIdx(14, 0);
        list.display();
        list.insertAtIdx(66, 2);
        list.insertAtIdx(14, 6);// 0 based
        // list.insertAtIdx(14, 60); // Cannot reach field next.
        list.display();
    }
}
