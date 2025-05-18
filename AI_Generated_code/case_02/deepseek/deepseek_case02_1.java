import java.util.Scanner;

public class CylinderCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the cylinder
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        // Prompt the user to enter the length of the cylinder
        System.out.print("Enter the length of the cylinder: ");
        double length = scanner.nextDouble();

        // Calculate the area of the cylinder
        double area = radius * radius * 3.14159;

        // Calculate the volume of the cylinder
        double volume = area * length;

        // Print the results
        System.out.printf("The area of the cylinder is: %.2f%n", area);
        System.out.printf("The volume of the cylinder is: %.2f%n", volume);

        // Close the scanner
        scanner.close();
    }
}