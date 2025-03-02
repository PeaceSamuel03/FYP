import java.util.Scanner;

public class CylinderCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the cylinder
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        // Prompt the user to enter the length of the cylinder
        System.out.print("Enter the length of the cylinder: ");
        double length = scanner.nextDouble();

        // Calculate the area of the cylinder using the formula: area = π * r^2
        double area = Math.PI * radius * radius;

        // Calculate the volume of the cylinder using the formula: volume = area * length
        double volume = area * length;

        // Display the results with two decimal places
        System.out.printf("The area of the cylinder is: %.2f%n", area);
        System.out.printf("The volume of the cylinder is: %.2f%n", volume);

        // Close the Scanner to free resources
        scanner.close();
    }
}