import java.util.Scanner;

public class ReverseDigits {

    // Method to reverse the digits of the given number
    public static void reverse(int number) {
        // Convert the number to a string
        String numberStr = Integer.toString(number);
        
        // Create a StringBuilder to reverse the string
        StringBuilder reversedStr = new StringBuilder(numberStr);
        
        // Reverse the string
        reversedStr.reverse();
        
        // Convert the reversed string back to an integer
        int reversedNumber = Integer.parseInt(reversedStr.toString());
        
        // Display the reversed number
        System.out.println("Reversed number: " + reversedNumber);
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
