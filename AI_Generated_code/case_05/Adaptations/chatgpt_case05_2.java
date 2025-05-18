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

    // Method to reverse the digits of the given integer using a String
    public static void reverse(int number) {
        // Convert the number to a string
        String numberStr = Integer.toString(number);

        // Check if the number is negative
        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            numberStr = numberStr.substring(1); // Remove negative sign for reversal
        }

        // Reverse the string using StringBuilder
        String reversedStr = new StringBuilder(numberStr).reverse().toString();

        // If the number was negative, add the negative sign back
        if (isNegative) {
            reversedStr = "-" + reversedStr;
        }

        // Print the reversed number
        System.out.println("Reversed number: " + reversedStr);
    }
}
