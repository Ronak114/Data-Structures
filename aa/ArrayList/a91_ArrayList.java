import java.util.ArrayList;

public class a91_ArrayList {
    public static void main(String[] args) {
        // same as vectors in c++.
        // part of Java Collection Framework.

        // syntax to create ArrayList.
        // ArrayList<Type> ArrayList_name = new ArrayList<>();...in same way we create
        // obj from class.
        // String | Boolean | Float ----- class

        ArrayList<Integer> list = new ArrayList<>();
        // <> -->describe type of  data

        // operations --> add,get,remove,set at index,contains ele

        // add operation T.C-->O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(3, 50);// TC O(n)
        System.out.println(list);

        // Get operation TC-->O(1)
        // list.get(2);
        int element = list.get(2);
        System.out.println(element);

        // remove operation TC-->O(n)(liner tym)
        list.remove(1);
        System.out.println(list);

        // Set operation TC-->O(n)(liner tym)
        list.set(0, 10);
        System.out.println(list);

        // contains operation TC-->O(n)(liner tym)
        System.out.println(list.contains(1));
        System.out.println(list.contains(10));

        // to get the size of list..size function
        System.out.println("length of list will be:" + list.size());

        // size used for iteration
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
