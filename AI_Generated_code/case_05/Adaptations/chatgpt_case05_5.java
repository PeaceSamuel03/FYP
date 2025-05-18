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

    // Method to reverse the digits of the given integer manually using string manipulation
    public static void reverse(int number) {
        // Convert the number to a string
        String numStr = Integer.toString(number);

        // If the number is negative, store the sign separately and remove it
        String sign = "";
        if (numStr.charAt(0) == '-') {
            sign = "-";
            numStr = numStr.substring(1); // Remove negative sign for reversal
        }

        // Initialize an empty string to store the reversed number
        String reversed = "";

        // Loop through the string from the end to the beginning
        for (int i = numStr.length() - 1; i >= 0; i--) {
            reversed += numStr.charAt(i);  // Append each character in reverse order
        }

        // If the number was negative, add the negative sign back to the reversed string
        if (!sign.isEmpty()) {
            reversed = sign + reversed;
        }

        // Print the reversed number
        System.out.println("Reversed number: " + reversed);
    }
}
