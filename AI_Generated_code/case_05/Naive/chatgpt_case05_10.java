import java.util.Scanner;

public class ReverseDigits {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Call the reverse method to display the reversed number
        reverse(number);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }

    // Method to reverse the digits of the given integer
    public static void reverse(int number) {
        // Check if the number is zero
        if (number == 0) {
            System.out.println("Reversed number: 0");
            return;
        }

        // Reverse the number and print the digits
        while (number != 0) {
            // Print the last digit
            System.out.print(number % 10);
            
            // Remove the last digit from the number
            number /= 10;
        }

        // Print a new line after the reversed digits
        System.out.println();
    }
}
