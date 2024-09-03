import java.util.ArrayList;
import java.util.Collections;
//import java.util.*;   to go in one line

public class a93_sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(39);
        list.add(4);
        list.add(5);

        System.out.println(list);
        // sort in ascending order
        Collections.sort(list);
        System.out.println(list);

        // descending order
        Collections.sort(list, Collections.reverseOrder());
        // Comparator - functn logic , can apply on obj as well
        System.out.println(list);
    }
}