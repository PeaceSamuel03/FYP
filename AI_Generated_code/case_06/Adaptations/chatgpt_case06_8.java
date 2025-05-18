import java.util.Scanner;

public class ReverseIntegers {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Create a StringBuilder to store the integers
        StringBuilder numbers = new StringBuilder();

        // Prompt the user to enter 10 integers
        System.out.println("Enter 10 integers:");

        // Read 10 integers from the user and append them to the StringBuilder
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers.append(scanner.nextInt()).append(" ");
        }

        // Reverse the StringBuilder and show the integers in reversed order
        System.out.println("\nIntegers in reversed order:");
        String reversed = numbers.reverse().toString();
        
        // Print the reversed string, but we want to remove the trailing space
        System.out.println(reversed.trim());

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
