import java.util.Scanner;
import java.util.LinkedList;

public class ReverseIntegers {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Create a LinkedList to store the integers
        LinkedList<Integer> numbers = new LinkedList<>();

        // Prompt the user to enter 10 integers
        System.out.println("Enter 10 integers:");

        // Read 10 integers from the user and add them to the LinkedList
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }

        // Show the integers in reversed order
        System.out.println("\nIntegers in reversed order:");
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i) + " ");
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
