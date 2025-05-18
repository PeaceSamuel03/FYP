import java.util.Scanner;
import java.util.Stack;

public class ReverseIntegers {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Create a Stack to store the integers
        Stack<Integer> stack = new Stack<>();

        // Prompt the user to enter 10 integers
        System.out.println("Enter 10 integers:");

        // Read 10 integers from the user and push them onto the stack
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            stack.push(scanner.nextInt());
        }

        // Show the integers in reversed order by popping elements from the stack
        System.out.println("\nIntegers in reversed order:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
