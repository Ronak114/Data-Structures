import java.util.*;

public class a47_diamteNodes { // O(n)
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

    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info righInfo = diameter(root.right);

        int selfdia = Math.max(Math.max(leftInfo.diam, righInfo.diam), leftInfo.ht + righInfo.ht + 1);
        
        int ht = Math.max(leftInfo.ht, righInfo.ht) + 1;

        return new Info(selfdia, ht);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("diameter : " + diameter(root));
        System.out.println("diameter : " + diameter(root).diam);
        System.out.println("height : " + diameter(root).ht);
    }
}
