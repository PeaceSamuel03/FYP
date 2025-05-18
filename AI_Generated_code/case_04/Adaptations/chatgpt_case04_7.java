public class MilesToKilometersConversion {

    public static void main(String[] args) {
        // Call the method to generate and print the conversion table
        printConversionTable();
    }

    // Method to generate and print the conversion table
    public static void printConversionTable() {
        // Print the header of the conversion table
        System.out.println("Miles\tKilometers");
        System.out.println("--------------------");

        // Loop through the first 10 miles and print the conversion
        for (int miles = 1; miles <= 10; miles++) {
            // Calculate the kilometers and print the result in a tabular format
            double kilometers = convertMilesToKilometers(miles);
            System.out.printf("%d\t%.3f\n", miles, kilometers);
        }
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKilometers(int miles) {
        // Conversion factor: 1 mile = 1.609 kilometers
        return miles * 1.609;
    }
}
