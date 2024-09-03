import java.util.ArrayList;
import java.util.Collections;

public class a94_multidimAL {
    public static void main(String[] args) {
        // syntax
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        // created sub arrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        mainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        mainList.add(list2);

        // to trace the main list to take sub list
        for (int i = 0; i < mainList.size(); i++) {
            // to traverse the sub list
            ArrayList<Integer> currList = mainList.get(i); // it will give puri ki puri list.
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(mainList);
    }
}