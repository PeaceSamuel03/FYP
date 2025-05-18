import java.util.Arrays;
import java.util.List;

public class Welcome {
    public static void main(String[] args) {
        // Creating a list with the message repeated five times
        List<String> messages = Arrays.asList("Welcome to Java", "Welcome to Java", "Welcome to Java", "Welcome to Java", "Welcome to Java");

        // Using a for-each loop to print the message
        for (String message : messages) {
            System.out.println(message);
        }
    }
}
