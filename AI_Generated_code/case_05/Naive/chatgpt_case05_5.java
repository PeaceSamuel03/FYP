import java.util.Scanner;

public class ReverseDigits {

    // Method to reverse the digits of the given number using an array
    public static void reverse(int number) {
        // Create an array to store the digits
        int[] digits = new int[10];  // Assuming the number has no more than 10 digits
        int index = 0;
        
        // Extract each digit and store it in the array
        while (number != 0) {
            digits[index] = number % 10;
            number /= 10;
            index++;
        }

        // Print the digits in reverse order (they are already in reverse order in the array)
        System.out.print("Reversed number: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();  // Move to a new line after printing the reversed number
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
