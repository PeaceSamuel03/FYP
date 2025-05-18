import java.util.Scanner;

public class ReverseDigits {

    // Method to reverse the digits of the given number using StringBuffer
    public static void reverse(int number) {
        // Convert the number to a String
        String numberStr = Integer.toString(number);
        
        // Create a StringBuffer and append the number's string representation
        StringBuffer reversedStr = new StringBuffer(numberStr);
        
        // Reverse the StringBuffer
        reversedStr.reverse();
        
        // Convert the reversed string back to an integer and print it
        System.out.println("Reversed number: " + reversedStr.toString());
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
