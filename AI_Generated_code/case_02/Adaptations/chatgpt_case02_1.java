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
        // Create a scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Accept radius and length as input from the user
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the length of the cylinder: ");
        double length = scanner.nextDouble();

        // Calculate the area using the method
        double area = calculateArea(radius);

        // Calculate the volume using the method
        double volume = calculateVolume(area, length);

        // Print the area and volume with appropriate formatting
        System.out.printf("Area of the cylinder: %.2f\n", area);
        System.out.printf("Volume of the cylinder: %.2f\n", volume);

        // Close the scanner
        scanner.close();
    }
}
