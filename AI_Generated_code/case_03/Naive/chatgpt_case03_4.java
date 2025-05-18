import java.util.Scanner;

class Person {
    // Instance variables
    private double weight; // in pounds
    private double feet;   // height in feet
    private double inches; // height in inches

    // Constructor to initialize weight, feet, and inches
    public Person(double weight, double feet, double inches) {
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
    }

    // Method to calculate the BMI
    public double calculateBMI() {
        double heightInInches = feet * 12 + inches; // Convert height to inches
        return weight * 0.45359237 / (heightInInches * 0.0254) / (heightInInches * 0.0254);
    }

    // Method to categorize BMI
    public String categorizeBMI() {
        double bmi = calculateBMI();
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

    // Method to display BMI and category
    public void displayBMIAndCategory() {
        double bmi = calculateBMI();
        String category = categorizeBMI();
        System.out.printf("BMI: %.2f\n", bmi);
        System.out.println("Category: " + category);
    }
}

public class BMICalculator {
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

        // Create a Person object with the provided weight and height
        Person person = new Person(weight, feet, inches);

        // Display the BMI and its category
        person.displayBMIAndCategory();

        // Close the scanner
        scanner.close();
    }
}
