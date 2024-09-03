import java.util.*;

public class a59_BalancedBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // to print in preorder form.
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    //to create a bst
    public static Node createBST(int a[],int start,int end){
        if(start>end){
            return null;
        }
        int mid = (start + (end-start)/2);
        Node root = new Node(a[mid]);
        root.left = createBST(a, start, mid-1);
        root.right = createBST(a, mid+1, end);

        return root;
    }

    public static void main(String[] args) {
       int a[] = {3,5,6,8,10,11,12};
        Node root = createBST(a, 0, a.length-1);
        preorder(root);
    }
}