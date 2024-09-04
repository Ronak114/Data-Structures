import java.util.LinkedList;

public class a1_inbuiltLL{
    //inbuilt linkedlist.
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(9);
        ll.add(2);
        ll.add(1);
        ll.add(33);
        System.out.println(ll);
        System.out.println(ll.get(2));
    }
}