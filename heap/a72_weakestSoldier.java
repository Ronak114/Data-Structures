import java.util.*;

public class a72_weakestSoldier {

    static class Row implements Comparable<Row> {
        int soldier;
        int idx;

        public Row(int soldier, int idx) {
            this.soldier = soldier;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row r2) {
            if (this.soldier == r2.soldier) {
                return this.idx - r2.idx; // compare on the basis of idx.
            } else {
                return this.soldier - r2.soldier; // else compare on the basis of soldier.
            }
        }
    }

    public static void main(String[] args) {
        int mat[][] = { { 1, 0, 0, 0 }, { 1, 1, 1, 1 }, { 1, 0, 0, 0 }, { 1, 0, 0, 0 } };
        int k = 2;

        PriorityQueue<Row> pq = new PriorityQueue<>();

        for (int i = 0; i < mat.length; i++) {
            int c = 0;
            for (int j = 0; j < mat[0].length; j++) {
                c += mat[i][j] == 1 ? 1 : 0;
            }
            pq.add(new Row(c, i));
        }

        // to print waekest soldier.
        for (int i = 0; i < k; i++) {
            System.out.println("row : " + pq.remove().idx);
        }
    }
    // Pq - 0,2,3,1.

}