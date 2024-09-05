public class a8_deleteNode {
    private Node head;
    private Node tail;
    private int size;

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

    public int deleteFirst() {
        int val = head.data;
        head = head.next;

        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteEnd() { // O(n)
        if (size == 1) {
            return deleteFirst();
        }
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        // //forget to set the tail
        // int val=tail.data;
        // temp.next=null;
        int val = tail.data;
        tail = temp;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int idx) {
        if (idx == 0) {
            return deleteFirst();
        }
        if (idx == size - 1) {
            return deleteEnd();
        }

        Node prevNode = head;
        for (int i = 1; i < idx; i++) {
            prevNode = prevNode.next;
        }

        int val = prevNode.next.data;
        prevNode.next = prevNode.next.next;
        size--;
        return val;
    }

    public Node search(int data){
        int idx=0;
        Node temp=head;
        while(temp != null){
            if(temp.data==data){
                return temp;
            }
            temp=temp.next;
        }
        return null;
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
        a8_deleteNode list = new a8_deleteNode();
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertEnd(100);
        list.insertAtIdx(66, 2);
        System.out.println(list.search(3));
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteEnd();
        list.display();
        list.delete(0);// 0 based indexing/
        list.display();

    }
}
