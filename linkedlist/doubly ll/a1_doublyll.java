import java.util.*;

public class a1_doublyll {

    private Node head;
    // private Node tail;
    // int size;

    public void insertFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }
    
    public void display() {
        Node temp = head;
        
        // to print in revrse
        Node last = null;
        
        while (temp != null) {
            System.out.print(temp.data + "->");
            last=temp;
            temp = temp.next;
        }
        System.out.println("end");

        System.out.println("Print in reverse");
        while (last != null) {
            System.out.print(last.data + "->");
            last = last.prev;
        }
        System.out.println("start");
    }

    private class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args) {
        a1_doublyll list = new a1_doublyll();
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(5);
        list.display();
    }
}
