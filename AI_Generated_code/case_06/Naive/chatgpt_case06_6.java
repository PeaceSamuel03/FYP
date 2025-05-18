import java.util.Scanner;

public class ReverseIntegers {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Create an array to store 10 integers
        int[] numbers = new int[10];

        // Prompt the user to enter 10 integers
        System.out.println("Enter 10 integers:");

        // Read 10 integers from the user
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Display the integers in reverse order
        System.out.println("\nIntegers in reversed order:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
