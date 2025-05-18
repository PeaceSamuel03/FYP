import java.util.Scanner;
import java.util.ArrayList;

public class ReverseOrderUsingArrayList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();  // ArrayList to store integers

        // Accept 10 integers from the user and add them to the ArrayList
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            numbers.add(number);  // Add the number to the ArrayList
        }

        // Display the integers in reverse order using a for loop
        System.out.println("Integers in reverse order:");
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();  // Move to the next line after printing

        scanner.close();
    }
}
