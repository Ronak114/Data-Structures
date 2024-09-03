public class a51_displacement {
    // route=WNEENESENNN.
    // find shortest dist = displacement.
    public static float getpath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // south
            if (dir == 'S') {
                y--;
            }
            // north
            else if (dir == 'N') {
                y++;
            }
            // west
            else if (dir == 'W') {
                x--;
            }
            // east
            else {
                x++;
            }
        }
        /****************remember****************** */
        // double m = Math.pow(x, 2) + Math.pow(y, 2);
        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String args[]) {
        String route = "WNEENESENNN";
        System.out.println(getpath(route));
    }
}
// TC..O(n)