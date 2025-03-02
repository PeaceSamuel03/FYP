import java.util.Scanner;

public class ReverseOrder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];  // Array to hold 10 integers

        // Accept 10 integers from the user
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Display the integers in reverse order
        System.out.println("Integers in reverse order:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();  // Move to the next line after printing

        scanner.close();
    }
}
