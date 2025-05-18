import java.util.Scanner;

public class ReverseDigits {

    // Method to reverse the digits of the given number using recursion
    public static void reverse(int number) {
        // Call the helper method to recursively reverse the digits
        reverseHelper(number);
    }

    // Helper method for recursion to print the reversed digits
    private static void reverseHelper(int number) {
        if (number == 0) {
            return;
        }
        
        // Extract the last digit and print it first (this ensures reversed order)
        System.out.print(number % 10);
        
        // Call the method recursively with the remaining number
        reverseHelper(number / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept an integer input from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Call the reverse method
        System.out.print("Reversed number: ");
        reverse(number);
        System.out.println();  // New line after printing the reversed number
        
        scanner.close();
    }
}
