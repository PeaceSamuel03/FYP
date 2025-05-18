import java.util.Map;
import java.util.LinkedHashMap;

public class MilesToKilometers {
    public static void main(String[] args) {
        final double CONVERSION_FACTOR = 1.609;
        Map<Integer, Double> conversionMap = new LinkedHashMap<>();
        
        for (int miles = 1; miles <= 10; miles++) {
            conversionMap.put(miles, miles * CONVERSION_FACTOR);
        }
        
        System.out.println("Miles   Kilometers");
        System.out.println("------------------");
        
        conversionMap.forEach((miles, kilometers) -> 
            System.out.printf("%-6d  %.3f%n", miles, kilometers));
    }
}
