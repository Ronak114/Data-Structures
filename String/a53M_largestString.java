public class a53M_largestString {
    // from given set find largest string.
    public static void main(String args[]) {
        String fruits[] = { "apple", "mango", "banana" };

        String largest = fruits[0];// consider first as largest string.
        for (int i = 0; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}//TC...O(x*n) --compareTo 
// x-length