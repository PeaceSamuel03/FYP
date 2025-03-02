import java.util.Scanner;

public class ReverseDigits {

    // Method to reverse the digits of the given number
    public static void reverse(int number) {
        int reversed = 0;
        
        // Reversing the digits
        while (number != 0) {
            int digit = number % 10;  // Extract the last digit
            reversed = reversed * 10 + digit;  // Append the digit to the reversed number
            number /= 10;  // Remove the last digit from the original number
        }
        
        // Display the reversed number
        System.out.println("Reversed number: " + reversed);
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
