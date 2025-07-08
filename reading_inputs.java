import java.util.Scanner;

public class reading_inputs {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // String input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Double input
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        System.out.println("\n--- User Info ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);

        // Close the scanner;
        scanner.close();
    }
}
