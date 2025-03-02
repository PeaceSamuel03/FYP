import java.util.Scanner;

public class ReverseDigits {

    // Method to reverse the digits of the given number using String manipulation
    public static void reverse(int number) {
        // Convert the number to a string
        String numberStr = Integer.toString(number);
        
        // Use StringBuilder to reverse the string
        StringBuilder reversedStr = new StringBuilder(numberStr);
        reversedStr.reverse();  // Reverse the string

        // Convert the reversed string back to an integer and display it
        System.out.println("Reversed number: " + reversedStr);
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
