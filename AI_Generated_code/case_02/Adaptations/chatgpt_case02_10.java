import java.util.Scanner;

public class Cylinder {

    // Instance variables for radius and length
    private double radius;
    private double length;

    // Constructor to initialize the cylinder with radius and length
    public Cylinder(double radius, double length) {
        this.radius = radius;
        this.length = length;
    }

    // Method to calculate the area of the cylinder
    public double getArea() {
        return radius * radius * 3.14159;
    }

    // Method to calculate the volume of the cylinder
    public double getVolume() {
        return getArea() * length;
    }

    // Method to display the area and volume
    public Cylinder displayResults() {
        System.out.printf("The area of the cylinder is: %.2f\n", getArea());
        System.out.printf("The volume of the cylinder is: %.2f\n", getVolume());
        return this; // Returning the current object for method chaining
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the radius and length of the cylinder
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the length of the cylinder: ");
        double length = scanner.nextDouble();

        // Create a Cylinder object with the provided radius and length
        Cylinder cylinder = new Cylinder(radius, length);

        // Call the displayResults method and chain it
        cylinder.displayResults();

        // Close the scanner
        scanner.close();
    }
}
