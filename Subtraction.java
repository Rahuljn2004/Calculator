import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble(); // Read first number

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble(); // Read second number

        // Perform subtraction
        double sum = num1 - num2;

        // Display the result
        System.out.println("The sub of " + num1 + " and " + num2 + " is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
