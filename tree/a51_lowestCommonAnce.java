import java.nio.file.NotDirectoryException;
import java.util.*;

// TC - O(n) SC-O(n) *ArrayList
public class a51_lowestCommonAnce {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = left;
            this.right = right;

        }
    }

    // Approach 1.
    public static boolean getPath(Node root, int n, ArrayList<Node> p) {
        if (root == null) {
            return false;
        }
        p.add(root);

        if (root.data == n) {
            return true;
        }
        boolean foundLeft = getPath(root.left, n, p);
        boolean foundRight = getPath(root.right, n, p);

        if (foundLeft || foundRight) {
            return true;
        }

        p.remove(p.size() - 1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> p1 = new ArrayList<>();
        ArrayList<Node> p2 = new ArrayList<>();

        getPath(root, n1, p1);
        getPath(root, n2, p2);

        int i = 0;
        for (; i < p1.size() && i < p2.size(); i++) {
            if (p1.get(i) != p2.get(i)) {
                break;
            }
        }
        Node lca = p1.get(i - 1);
        return lca;
    }

    // Approach 2.
    public static Node lca2(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        if (rightLca == null) {
            return leftLca;
        }
        if (leftLca == null) {
            return rightLca;
        }

        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(lca(root, 4, 6).data);
        System.out.println(lca2(root, 4, 6).data);
    }
}
