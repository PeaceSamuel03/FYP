public class MilesToKilometersConversion {

    public static void main(String[] args) {
        // Print the header of the conversion table
        System.out.println("Miles\tKilometers");
        System.out.println("--------------------");

        // Loop through the first 10 miles and convert each mile to kilometers
        for (int miles = 1; miles <= 10; miles++) {
            // Call the method to convert miles to kilometers
            double kilometers = convertMilesToKilometers(miles);
            
            // Print the result in a tabular format
            System.out.printf("%d\t%.3f\n", miles, kilometers);
        }
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKilometers(int miles) {
        // Conversion factor: 1 mile = 1.609 kilometers
        return miles * 1.609;
    }
}
