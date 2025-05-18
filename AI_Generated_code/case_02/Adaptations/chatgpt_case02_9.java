import java.util.Scanner;

public class Cylinder {

    // Instance variables for radius and length
    private double radius;
    private double length;
    private double area;
    private double volume;

    // Constructor to initialize the cylinder and calculate area and volume
    public Cylinder(double radius, double length) {
        this.radius = radius;
        this.length = length;
        this.area = calculateArea();
        this.volume = calculateVolume();
    }

    // Method to calculate the area of the cylinder
    private double calculateArea() {
        return radius * radius * 3.14159;
    }

    // Method to calculate the volume of the cylinder
    private double calculateVolume() {
        return area * length;
    }

    // Method to display the results
    public void displayResults() {
        System.out.printf("The area of the cylinder is: %.2f\n", area);
        System.out.printf("The volume of the cylinder is: %.2f\n", volume);
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

        // Display the results of the area and volume calculations
        cylinder.displayResults();

        // Close the scanner
        scanner.close();
    }
}
