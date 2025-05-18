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

        // Close the scanner
        scanner.close();
    }

    // Method to reverse the digits of the given integer
    public static void reverse(int number) {
        // While loop to reverse the number
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
