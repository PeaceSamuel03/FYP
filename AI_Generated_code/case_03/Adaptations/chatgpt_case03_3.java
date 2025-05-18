import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Create an array to hold the input values (weight and height)
        double[] weightAndHeight = new double[3]; // [0] = weight, [1] = feet, [2] = inches

        // Accept weight in pounds (real number)
        System.out.print("Enter your weight in pounds: ");
        weightAndHeight[0] = scanner.nextDouble();

        // Accept height in feet and inches (real numbers)
        System.out.print("Enter your height in feet: ");
        weightAndHeight[1] = scanner.nextDouble();

        System.out.print("Enter your height in inches: ");
        weightAndHeight[2] = scanner.nextDouble();

        // Calculate and display the BMI using the method
        double bmi = calculateBMI(weightAndHeight);

        // Display the BMI value with 2 decimal places
        System.out.printf("Your BMI is: %.2f\n", bmi);

        // Categorize the BMI based on the conditions
        categorizeBMI(bmi);

        // Close the scanner object
        scanner.close();
    }

    // Method to calculate BMI using an array (weight, height in feet, height in inches)
    public static double calculateBMI(double[] input) {
        // Convert height to inches (1 foot = 12 inches)
        double totalInches = input[1] * 12 + input[2];

        // Convert weight from pounds to kilograms (1 pound = 0.45359237 kg)
        double weightInKg = input[0] * 0.45359237;

        // Convert height from inches to meters (1 inch = 0.0254 meters)
        double heightInMeters = totalInches * 0.0254;

        // Calculate and return BMI
        return weightInKg / (heightInMeters * heightInMeters);
    }

    // Method to categorize BMI based on the value
    public static void categorizeBMI(double bmi) {
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("You are normal weight.");
        } else if (bmi >= 25 && bmi < 35) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
    }
}
