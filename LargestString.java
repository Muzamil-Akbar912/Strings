public class LargestString {
    // Time complexity = O(xn)
    public static String largest(String fruits[]) {
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareToIgnoreCase(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }

        return largest;
    }
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana", "peach"};

        System.out.println("The largest string is " + largest(fruits));
    }
}
