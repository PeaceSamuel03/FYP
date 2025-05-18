public class Cylinder {

    // Constant for PI
    public static final double PI = 3.14159;

    // Method to calculate the area of the cylinder
    public static double calculateArea(double radius) {
        return radius * radius * PI;
    }

    // Method to calculate the volume of the cylinder
    public static double calculateVolume(double area, double length) {
        return area * length;
    }

    public static void main(String[] args) {
        // Check if the user has provided the necessary arguments
        if (args.length != 2) {
            System.out.println("Please provide the radius and length of the cylinder as command-line arguments.");
            return;
        }

        // Parse the radius and length from the command-line arguments
        double radius = Double.parseDouble(args[0]);
        double length = Double.parseDouble(args[1]);

        // Validate that the radius and length are positive numbers
        if (radius <= 0 || length <= 0) {
            System.out.println("Radius and length must be positive numbers.");
            return;
        }

        // Calculate the area using the method
        double area = calculateArea(radius);

        // Calculate the volume using the method
        double volume = calculateVolume(area, length);

        // Print the results
        System.out.printf("Area of the cylinder: %.2f\n", area);
        System.out.printf("Volume of the cylinder: %.2f\n", volume);
    }
}
