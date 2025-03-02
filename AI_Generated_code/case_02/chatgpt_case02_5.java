import java.util.Scanner;

public class Cylinder {
    
    // Method to calculate the area of the cylinder
    public static double calculateArea(double radius) {
        return radius * radius * 3.14159;
    }

    // Method to calculate the volume of the cylinder
    public static double calculateVolume(double area, double length) {
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

        // Calculate the area of the cylinder by calling the calculateArea method
        double area = calculateArea(radius);

        // Calculate the volume of the cylinder by calling the calculateVolume method
        double volume = calculateVolume(area, length);

        // Print the area and volume of the cylinder
        System.out.printf("The area of the cylinder is: %.2f\n", area);
        System.out.printf("The volume of the cylinder is: %.2f\n", volume);

        // Close the scanner
        scanner.close();
    }
}
