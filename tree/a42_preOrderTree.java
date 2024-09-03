import java.util.*;

// building of tree + treversal.
// DFS
public class a42_preOrderTree { // O(n)
    // Node class
    static class Node {
        int data;
        // child
        Node left;
        Node right;

        // constructor
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Binary tree class.
    static class binaryTree {
        static int idx = -1; // static bcz we want that idx should update in every recursion

        // return root.
        public static Node buildTree(int node[]) {
            idx++;
            if (node[idx] == -1) {
                return null;
            }

            Node newNode = new Node(node[idx]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);

            return newNode;
        }

        // Preorder traversal
        public static void Preorder(Node root) { // O(n)
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            Preorder(root.left);
            Preorder(root.right);
        }

        // Inorder traversal
        public static void inorder(Node root) { // O(n)
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        // Post traversal
        public static void postorder(Node root) { // O(n)
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        // level traversal
        public static void levelorder(Node root) { // O(n)
            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            // add root and null
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                // remove and store in curr node
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    // print data
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        binaryTree t = new binaryTree();
        Node root = t.buildTree(nodes);
        System.out.println(root.data);

        // t.Preorder(root);
        // t.inorder(root);
        // t.postorder(root);
        t.levelorder(root);
    }
}
