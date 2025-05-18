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
        // To store the reversed number
        int reversed = 0;

        // Reverse the number by extracting digits
        while (number != 0) {
            // Get the last digit of the number
            int digit = number % 10;

            // Add the digit to the reversed number
            reversed = reversed * 10 + digit;

            // Remove the last digit from the number
            number /= 10;
        }

        // Print the reversed number
        System.out.println("Reversed number: " + reversed);
    }
}
