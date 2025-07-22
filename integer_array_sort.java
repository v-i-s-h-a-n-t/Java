import java.util.Arrays;

public class integer_array_sort {
    public static void main(String[] args) {
        Integer numbers[] = { 5, 2, 9, 1, 3, 7 };

        Arrays.sort(numbers, new ascending_comparator());
        System.out.println("Ascending order");
        System.out.println(Arrays.toString(numbers));

        System.out.println();

        Arrays.sort(numbers, new descending_comparator());
        System.out.println("Descending order");
        System.out.println(Arrays.toString(numbers));
    }
}
