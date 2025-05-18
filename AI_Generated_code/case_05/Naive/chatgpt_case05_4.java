import java.util.Scanner;
import java.util.Stack;

public class ReverseDigits {

    // Method to reverse the digits of the given number using a stack
    public static void reverse(int number) {
        // Create a stack to hold the digits
        Stack<Integer> stack = new Stack<>();

        // Push each digit of the number onto the stack
        while (number != 0) {
            stack.push(number % 10);
            number /= 10;
        }

        // Pop the digits from the stack and print them to form the reversed number
        System.out.print("Reversed number: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
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
