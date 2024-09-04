//add and print ll.
import java.util.LinkedList;

public class a3_addLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // methods to do opertions
    // static nhi likh rahe bcz main funtn already static hai..static futn mai static funtn ko he call kr skte hai
    public void addFirst(int data) {
        // step 1 : create new node
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 : newnode next = head;
        newNode.next = head; // link

        // step 3: head = newNode
        head = newNode;
    }
    // TC-O(1)

    public void addLast(int data) {
        // step1 : create node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2 : tail next = newNode
        tail.next = newNode;
        // step3 : tail=newNode
        tail = newNode;
    }
    //TC-O(1)

    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        a3_addLL ll = new a3_addLL();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        // ll.addFirst(5);

    }
}

