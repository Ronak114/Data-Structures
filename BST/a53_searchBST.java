import java.util.*;
public class a53_searchBST { // O(h)

    // search in bst.
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Search.
    public static boolean searchBst(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return searchBst(root.left, key);
        } else {
            return searchBst(root.right, key);
        }

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

    public static void main(String args[]) {
        Node root = new Node(6);
        root.left = new Node(4);
        root.right = new Node(8);
        root.left.left = new Node(2);
        root.left.right = new Node(5);
        root.right.left = new Node(7);
        root.right.right = new Node(9);

        if (searchBst(root, -8)) {
            System.out.println("found");
        } else {
            System.out.println("Not found");
        }
        inorder(root);
    }
}
