import java.util.Scanner;

public class Cylinder {
    
    // Static method to calculate the area of the cylinder
    public static double calculateArea(double radius) {
        return radius * radius * 3.14159;
    }

    // Static method to calculate the volume of the cylinder
    public static double calculateVolume(double radius, double length) {
        double area = calculateArea(radius); // Call the calculateArea method
        return area * length;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the radius and length of the cylinder
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the length of the cylinder: ");
        double length = scanner.nextDouble();

        // Calculate the area and volume of the cylinder using static methods
        double area = calculateArea(radius);
        double volume = calculateVolume(radius, length);

        // Print the area and volume of the cylinder
        System.out.printf("The area of the cylinder is: %.2f\n", area);
        System.out.printf("The volume of the cylinder is: %.2f\n", volume);

        // Close the scanner
        scanner.close();
    }
}
