import java.util.*;

public class a44_countNodes { // O(n)
    // Node class
    static class Node {
        int data;
        Node left;
        Node right;

        // constructor
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int countNode(Node root) {
        if (root == null) {
            return 0;
        }
        int lcount = countNode(root.left);
        int rcount = countNode(root.right);
        int count = lcount + rcount +1;
        return count;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("no of nodes : " + countNode(root));
    }
}
