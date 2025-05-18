import java.util.Scanner;

public class Cylinder {

    // Method to calculate and return the area and volume of the cylinder
    public static String calculateAreaAndVolume(double radius, double length) {
        double area = radius * radius * 3.14159;
        double volume = area * length;

        return String.format("The area of the cylinder is: %.2f\nThe volume of the cylinder is: %.2f", area, volume);
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the radius and length of the cylinder
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the length of the cylinder: ");
        double length = scanner.nextDouble();

        // Get the result from the calculateAreaAndVolume method
        String result = calculateAreaAndVolume(radius, length);

        // Print the result
        System.out.println(result);

        // Close the scanner
        scanner.close();
    }
}
