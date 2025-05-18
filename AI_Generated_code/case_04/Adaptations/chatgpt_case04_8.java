public class MilesToKilometersConversion {

    public static void main(String[] args) {
        // Generate the conversion table and print it
        String conversionTable = buildConversionTable();
        System.out.println(conversionTable);
    }

    // Method to generate and return the conversion table as a string
    public static String buildConversionTable() {
        // Initialize a StringBuilder to build the table
        StringBuilder table = new StringBuilder();

        // Add the header of the conversion table
        table.append("Miles\tKilometers\n");
        table.append("--------------------\n");

        // Loop through the first 10 miles and add the conversion to the table
        for (int miles = 1; miles <= 10; miles++) {
            // Calculate the kilometers and append the result to the table
            double kilometers = convertMilesToKilometers(miles);
            table.append(String.format("%d\t%.3f\n", miles, kilometers));
        }

        // Return the complete table as a string
        return table.toString();
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKilometers(int miles) {
        // Conversion factor: 1 mile = 1.609 kilometers
        return miles * 1.609;
    }
}
