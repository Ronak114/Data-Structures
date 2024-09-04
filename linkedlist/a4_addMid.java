//add in middle
import java.util.LinkedList;

public class a4_addMid {
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

    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i=0;
        
        while(i < idx -1){
            temp = temp.next;
            i++;
        }
        //i=idx-1;temp-->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

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
        a4_addMid ll = new a4_addMid();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2,9);
        ll.print();

    }
}