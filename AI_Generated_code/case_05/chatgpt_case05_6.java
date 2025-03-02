import java.util.Scanner;

public class ReverseDigits {

    // Method to reverse the digits of the given number using StringBuilder
    public static void reverse(int number) {
        // Convert the number to a string
        String numberStr = Integer.toString(number);

        // Create a StringBuilder to build the reversed number
        StringBuilder reversedStr = new StringBuilder();

        // Process each character (digit) of the string and prepend it to the StringBuilder
        for (int i = numberStr.length() - 1; i >= 0; i--) {
            reversedStr.append(numberStr.charAt(i));
        }

        // Convert the reversed string back to an integer and print it
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
