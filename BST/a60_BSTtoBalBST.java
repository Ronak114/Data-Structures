import java.util.*;

public class a60_BSTtoBalBST { // TC - O(n).
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // to balance the BST.
    public static Node BalanceBST(Node root) {
        // inorder form.
        ArrayList<Integer> inorder = new ArrayList<>();
        getinorder(root, inorder);

        // sorted
        root = createBST(inorder, 0, inorder.size()-1);

        return root;

    }

    public static void getinorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }
        getinorder(root.left, inorder);
        inorder.add(root.data);
        getinorder(root.right, inorder);
    }

    // to print final form in preorder form.
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // to create a bst
    public static Node createBST(ArrayList<Integer> a, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + (end - start) / 2);
        Node root = new Node(a.get(mid));
        root.left = createBST(a, start, mid - 1);
        root.right = createBST(a, mid + 1, end);

        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        root  = BalanceBST(root);
        // root = createBST(al, 0, al.size() - 1);
        preorder(root);
    }
}