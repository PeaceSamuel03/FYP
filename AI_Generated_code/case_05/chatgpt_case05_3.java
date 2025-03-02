import java.util.Scanner;

public class ReverseDigits {

    // Recursive method to reverse the digits of the given number
    public static void reverse(int number) {
        reverseHelper(number, 0);
    }

    // Helper method for recursion
    private static void reverseHelper(int number, int reversed) {
        if (number == 0) {
            // When the number becomes 0, print the reversed number
            System.out.println("Reversed number: " + reversed);
            return;
        }
        
        // Get the last digit and add it to the reversed number
        int digit = number % 10;
        reversed = reversed * 10 + digit;
        
        // Recur with the remaining number
        reverseHelper(number / 10, reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept an integer input from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Call the reverse method
        reverse(number);
        
        scanner.close();
    }
}
