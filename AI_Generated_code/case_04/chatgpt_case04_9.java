import java.util.ArrayList;
import java.util.List;

public class MilesToKilometers {
    public static void main(String[] args) {
        final double CONVERSION_FACTOR = 1.609;
        List<String> conversionTable = new ArrayList<>();
        
        conversionTable.add("Miles   Kilometers");
        conversionTable.add("------------------");
        
        for (int miles = 1; miles <= 10; miles++) {
            double kilometers = miles * CONVERSION_FACTOR;
            conversionTable.add(String.format("%-6d  %.3f", miles, kilometers));
        }
        
        conversionTable.forEach(System.out::println);
    }
}