// Implementation of stack using LL
public class a13_stackLL {

    static class Node{ //To represent all the nodes
        int data;
        Node next;
        Node(int data){ //constructor
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        static Node head = null; //initially 

        public static boolean isEmpty(){
            return head ==null;
        }

        //push
        public static void push(int data) {
            Node newNode = new Node(data); // create new node

            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next =head;
            head = newNode;
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top= head.data;
            head = head.next;
            return top;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        Stack s =new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (! s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
