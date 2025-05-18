import java.util.Scanner;

public class Cylinder {

    // Method to calculate the area of the cylinder
    public static double calculateArea(double radius) {
        return Math.pow(radius, 2) * Math.PI;
    }

    // Method to calculate the volume of the cylinder
    public static double calculateVolume(double area, double length) {
        return area * length;
    }

    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);

        double radius = 0;
        double length = 0;

        // Accept radius and length of the cylinder
        System.out.print("Enter the radius of the cylinder: ");
        radius = scanner.nextDouble();

        System.out.print("Enter the length of the cylinder: ");
        length = scanner.nextDouble();

        // Validate the input
        if (radius <= 0 || length <= 0) {
            System.out.println("Radius and length must be positive values.");
            return;
        }

        // Calculate the area using the method
        double area = calculateArea(radius);

        // Calculate the volume using the method
        double volume = calculateVolume(area, length);

        // Print the results
        System.out.printf("Area of the cylinder: %.2f\n", area);
        System.out.printf("Volume of the cylinder: %.2f\n", volume);

        // Close the scanner
        scanner.close();
    }
}
