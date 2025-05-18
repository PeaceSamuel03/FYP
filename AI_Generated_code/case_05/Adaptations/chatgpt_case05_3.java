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

    // Method to reverse the digits of the given integer using recursion
    public static void reverse(int number) {
        // Base case: if the number is a single digit, just print it
        if (number < 10 && number > -10) {
            System.out.print(number);
            return;
        }
        
        // Recursively call reverse method to print the digits in reverse order
        System.out.print(number % 10);  // Print the last digit
        reverse(number / 10);           // Recurse with the remaining number (removing the last digit)
    }
}
