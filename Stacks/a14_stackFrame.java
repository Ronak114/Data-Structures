//implementation using java  Collection framework.
import java.util.*;

public class a14_stackFrame {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
// all the funtn(push,pop,peek,isEmpty) already exist in javaframe work.