import java.util.Scanner;

class Cylinder {
    // Instance variables for radius and length
    private double radius;
    private double length;

    // Constructor to initialize the radius and length
    public Cylinder(double radius, double length) {
        this.radius = radius;
        this.length = length;
    }

    // Method to calculate the area of the cylinder
    public double calculateArea() {
        return radius * radius * 3.14159;
    }

    // Method to calculate the volume of the cylinder
    public double calculateVolume() {
        return calculateArea() * length;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Accept radius and length of the cylinder
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the length of the cylinder: ");
        double length = scanner.nextDouble();

        // Create a Cylinder object
        Cylinder cylinder = new Cylinder(radius, length);

        // Calculate the area and volume using the methods
        double area = cylinder.calculateArea();
        double volume = cylinder.calculateVolume();

        // Print the results
        System.out.printf("Area of the cylinder: %.2f\n", area);
        System.out.printf("Volume of the cylinder: %.2f\n", volume);

        // Close the scanner
        scanner.close();
    }
}
