import java.util.*;

public class a92_trie {

    // class node to create childrens.
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false; // end of word

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    // root node will be empty
    public static Node root = new Node();

    // funtn to insert the node
    public static void insert(String word) { // O(L)
        Node curr = root;

        for (int level = 0; level < word.length(); level++) {
            char ch = word.charAt(level);
            int idx = ch - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    // futn to search
    public static boolean search(String key) { // O(L)
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }

    public static void main(String[] args) {
        String wrds[] = { "the", "a", "there", "their", "any", "thee" };

        for (int i = 0; i < wrds.length; i++) {
            insert(wrds[i]);
        }
        System.out.println(search("thor"));
        System.out.println(search("thee"));
        System.out.println(search("an"));
        System.out.println(search("any"));
    }
}
