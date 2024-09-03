import java.util.*;

public class a56_noOfPath {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            // this.left = null;
            // this.right = null;
        }
    }

    public static void Path(ArrayList<Integer> p) {
        for (int i = 0; i < p.size(); i++) {
            System.out.print(p.get(i) + "->");
        }
        System.out.println("n");
    }

    public static void printPath(Node root, ArrayList<Integer> p) {
        if (root == null) {
            return;
        }
        // add data
        p.add(root.data);

        if (root.left == null && root.right == null) {
            Path(p);
        }
        // for left sub tree
        printPath(root.left, p);
        // for right sub tree
        printPath(root.right, p);
        // remove
        p.remove(p.size() - 1);

    }

    // inorder traversing for verification.
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) { // O(h)
        Node root = new Node(6);
        root.left = new Node(4);
        root.right = new Node(8);
        root.left.left = new Node(2);
        root.left.right = new Node(5);
        root.right.left = new Node(7);
        root.right.right = new Node(9);

        inorder(root);
        System.out.println();
        printPath(root, new ArrayList<>());
    }
}
