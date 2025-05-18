public class MilesToKilometersConversion {

    public static void main(String[] args) {
        // Print the header of the table
        System.out.println("Miles\tKilometers");
        System.out.println("---------------------");

        // Loop to generate the conversion table for the first 10 miles
        for (int miles = 1; miles <= 10; miles++) {
            // Convert miles to kilometers
            double kilometers = miles * 1.609;

            // Display the conversion in a formatted manner
            System.out.printf("%d\t%.3f\n", miles, kilometers);
        }
    }
}
