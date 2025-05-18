import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Accept weight in pounds (real number)
        System.out.print("Enter your weight in pounds: ");
        double weight = scanner.nextDouble();

        // Accept height in feet and inches (real numbers)
        System.out.print("Enter your height in feet: ");
        double feet = scanner.nextDouble();

        System.out.print("Enter your height in inches: ");
        double inches = scanner.nextDouble();

        // Calculate the BMI
        double bmi = calculateBMI(weight, feet, inches);

        // Display the BMI value with 2 decimal places
        System.out.printf("Your BMI is: %.2f\n", bmi);

        // Categorize BMI based on the given conditions
        categorizeBMI(bmi);

        // Close the scanner object
        scanner.close();
    }

    // Method to calculate BMI
    public static double calculateBMI(double weight, double feet, double inches) {
        // Convert height to inches (1 foot = 12 inches)
        double totalInches = feet * 12 + inches;
        
        // Convert weight from pounds to kilograms (1 pound = 0.45359237 kg)
        double weightInKg = weight * 0.45359237;
        
        // Convert height from inches to meters (1 inch = 0.0254 meters)
        double heightInMeters = totalInches * 0.0254;
        
        // Calculate and return BMI
        return weightInKg / (heightInMeters * heightInMeters);
    }

    // Method to categorize BMI
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
