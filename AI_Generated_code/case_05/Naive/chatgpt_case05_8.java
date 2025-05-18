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
        // If the number is zero, print zero immediately
        if (number == 0) {
            System.out.println("Reversed number: 0");
            return;
        }

        // If the number is negative, handle the negative sign
        if (number < 0) {
            System.out.print("-"); // Print negative sign
            number = -number; // Make the number positive for reversing
        }

        // Reverse the number and print the digits
        while (number != 0) {
            // Print the last digit
            System.out.print(number % 10);
            
            // Remove the last digit from the number
            number /= 10;
        }
        System.out.println(); // Move to the next line after printing the reversed number
    }
}
