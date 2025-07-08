import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        // Array SIZE
        final int SIZE = 5;

        // Declaring an array of size 5 to hold integers
        int[] numArray = new int[SIZE];

        // Using for loop to add integers to array
        for (int i = 0; i < SIZE; i++) {
            numArray[i] = i + 1;
        }

        // Using for loop to print array contents
        for (int i = 0; i < SIZE; i++) {
            System.out.println(numArray[i]);
        }

        System.out.println();

        // Using toString function from java.util.Arrays to print the array
        System.out.println(Arrays.toString(numArray));
    }
}
