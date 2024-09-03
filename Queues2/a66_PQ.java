import java.util.Comparator;
import java.util.PriorityQueue;

public class a66_PQ {
    // to store class ke obj.
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            // sort according to rank
            return this.rank - s2.rank;
            // return (actually logic define kiya)
            // +ve -> ob1 < obj2
            // -ve -> ob1 > obj2
            // 0 -> equal
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("a", 4)); // O(log n)
        pq.add(new Student("a", 4));
        pq.add(new Student("L", 6));
        pq.add(new Student("Z", 2));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + "->" + pq.peek().rank); // O(1);
            pq.remove(); // O(log n)
        }

        System.out.println();

        PriorityQueue<Student> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
        pq1.add(new Student("a", 4)); // O(log n)
        pq1.add(new Student("a", 4));
        pq1.add(new Student("L", 6));
        pq1.add(new Student("Z", 2));

        while (!pq1.isEmpty()) {
            System.out.println(pq1.peek().name + "->" + pq1.peek().rank); // O(1);
            pq1.remove(); // O(log n)
        }
    }
}
