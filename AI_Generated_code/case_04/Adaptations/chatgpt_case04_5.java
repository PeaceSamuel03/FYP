public class MilesToKilometersConversion {

    public static void main(String[] args) {
        // Initialize miles as 1 (we'll increment it in the while loop)
        int miles = 1;

        // Print the header of the conversion table
        System.out.println("Miles\tKilometers");
        System.out.println("--------------------");

        // Use a while loop to iterate from 1 to 10
        while (miles <= 10) {
            // Convert the miles to kilometers
            double kilometers = convertMilesToKilometers(miles);

            // Print the result in a tabular format
            System.out.printf("%d\t%.3f\n", miles, kilometers);

            // Increment miles to move to the next mile value
            miles++;
        }
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKilometers(int miles) {
        // Conversion factor: 1 mile = 1.609 kilometers
        return miles * 1.609;
    }
}
