import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightInInches) {
        return weight * 0.45359237 / (heightInInches * 0.0254) / (heightInInches * 0.0254);
    }

    // Method to determine the category based on BMI
    public static String categorizeBMI(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 35) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Accept weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = scanner.nextDouble();

        // Accept height in feet and inches
        System.out.print("Enter height in feet: ");
        double feet = scanner.nextDouble();
        System.out.print("Enter height in inches: ");
        double inches = scanner.nextDouble();

        // Convert height to inches
        double heightInInches = feet * 12 + inches;

        // Calculate BMI using the method
        double bmi = calculateBMI(weight, heightInInches);

        // Categorize BMI
        String category = categorizeBMI(bmi);

        // Display the BMI and its category
        System.out.printf("BMI: %.2f\n", bmi);
        System.out.println("Category: " + category);

        // Close the scanner
        scanner.close();
    }
}
