import java.util.*;

public class a46_diaNodes { // O(n^2)
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

    // to calculate height
    public static int heightTree(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = heightTree(root.left);
        int rh = heightTree(root.right);

        return Math.max(lh, rh) + 1;
    }

    // to calculate diameter
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int ldia = diameter(root.left);
        int lh = heightTree(root.left);
        int rdia = diameter(root.right);
        int rh = heightTree(root.right);
        int selfdia = (lh+rh + 1);

        return Math.max(selfdia,Math.max(ldia,rdia));
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
    }
}
