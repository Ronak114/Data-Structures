import java.util.*;

public class a62_mergeBST { // O(n+m)
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

    public static void getinorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }
        getinorder(root.left, inorder);
        inorder.add(root.data);
        getinorder(root.right, inorder);
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

    public static Node mergeBST(Node root1, Node root2) {
        // Step 1 : add elements in al in inorder.
        ArrayList<Integer> arr1 = new ArrayList<>();
        getinorder(root1, arr1);

        // Step 2 : add elements in al in inorder.
        ArrayList<Integer> arr2 = new ArrayList<>();
        getinorder(root2, arr2);

        // Step 3 : merge them
        int i = 0, j = 0;
        ArrayList<Integer> finalArr = new ArrayList<>();
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                finalArr.add(arr1.get(i));
                i++;
            } else {
                finalArr.add(arr2.get(j));
                j++;
            }
        }
        while (i < arr1.size()) {
            finalArr.add(arr1.get(i));
            i++;
        }
        while (j < arr2.size()) {
            finalArr.add(arr2.get(j));
            j++;
        }

        // step 4 : create a bst.
        return createBST(finalArr, 0, finalArr.size() - 1);

    }

    // to print final form in preorder
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        // 1st bst
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        // 2nd bst
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBST(root1, root2);
        preorder(root);
    }
}