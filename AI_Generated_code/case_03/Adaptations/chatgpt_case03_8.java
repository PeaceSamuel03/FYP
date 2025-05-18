import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Accept weight in pounds (real number)
        System.out.print("Enter weight in pounds: ");
        double weight = scanner.nextDouble();

        // Accept height in feet and inches (real numbers)
        System.out.print("Enter height in feet: ");
        double feet = scanner.nextDouble();
        System.out.print("Enter height in inches: ");
        double inches = scanner.nextDouble();

        // Convert height to inches
        double heightInInches = feet * 12 + inches;

        // Calculate BMI using the formula
        double bmi = weight * 0.45359237 / (heightInInches * 0.0254) / (heightInInches * 0.0254);

        // Categorize BMI
        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            category = "Normal weight";
        } else if (bmi >= 25 && bmi < 35) {
            category = "Overweight";
        } else {
            category = "Obese";
        }

        // Display BMI and the category
        System.out.printf("BMI: %.2f\n", bmi);
        System.out.println("Category: " + category);

        // Close the scanner
        scanner.close();
    }
}
