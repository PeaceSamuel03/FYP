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

    // Method to reverse the digits of the given integer using an array
    public static void reverse(int number) {
        // Convert the number to a positive value for easier processing if it's negative
        int tempNumber = Math.abs(number);

        // Create an array to store the digits
        int[] digits = new int[String.valueOf(tempNumber).length()];

        // Store the digits in the array
        int i = 0;
        while (tempNumber != 0) {
            digits[i] = tempNumber % 10;  // Extract the last digit
            tempNumber /= 10;  // Remove the last digit
            i++;
        }

        // Print the reversed digits (use the array)
        System.out.print("Reversed number: ");
        if (number < 0) {
            System.out.print("-");  // If the original number was negative, print the minus sign
        }
        for (int j = 0; j < digits.length; j++) {
            System.out.print(digits[j]);  // Print each digit in reverse order
        }
        System.out.println();  // Move to the next line after printing the reversed number
    }
}
