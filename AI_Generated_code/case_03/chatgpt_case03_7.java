import java.util.Scanner;
import java.util.function.DoubleFunction;

public class BMICalculatorApp {

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

        // Calculate BMI
        double bmi = calculateBMI(weight, heightInInches);

        // Categorize BMI using a lambda expression
        String category = categorizeBMI(bmi);

        // Display the BMI and category
        System.out.printf("BMI: %.2f\n", bmi);
        System.out.println("Category: " + category);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightInInches) {
        return weight * 0.45359237 / (heightInInches * 0.0254) / (heightInInches * 0.0254);
    }

    // Method to categorize BMI using a lambda expression
    public static String categorizeBMI(double bmi) {
        DoubleFunction<String> bmiCategory = (bmiValue) -> {
            if (bmiValue < 18.5) return "Underweight";
            else if (bmiValue >= 18.5 && bmiValue < 25) return "Normal weight";
            else if (bmiValue >= 25 && bmiValue < 35) return "Overweight";
            else return "Obese";
        };
        return bmiCategory.apply(bmi);
    }
}
