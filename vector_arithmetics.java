public class vector_arithmetics {
    public static void main(String[] args) {
        int[] vectorA = { 1, 2, 3 };
        int[] vectorB = { 4, 5, 6 };
        int[] sum = new int[vectorA.length]; // Use either vectors length for size

        for (int i = 0; i < vectorA.length; i++) {
            sum[i] = vectorA[i] + vectorB[i];
        }
        System.out.println("Sum");
        for (int i = 0; i < sum.length; i++) {
            System.out.println(sum[i]);
        }
    }
}
