public class a52_bst { // O(h)
    // build a bst.
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // to insert a node.
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        // left subtree
        if (root.data > val) {
            root.left = insert(root.left, val);
        }
        // right subtree
        else {
            root.right = insert(root.right, val);
        }
        return root;
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
        int val[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        // for inserting
        for (int i = 0; i < val.length; i++) {
            root = insert(root, val[i]);
        }

        // to verify the sorted order.
        inorder(root);
    }
}
