public class Welcome {
    public static void main(String[] args) {
        // Array with five elements, each element holding the string
        String[] messages = {"Welcome to Java", "Welcome to Java", "Welcome to Java", "Welcome to Java", "Welcome to Java"};
        
        // Using a for-each loop to print the message five times
        for (String message : messages) {
            System.out.println(message);
        }
    }
}
