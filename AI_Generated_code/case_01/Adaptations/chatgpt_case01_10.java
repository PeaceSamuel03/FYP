public class Welcome {
    public static void main(String[] args) {
        StringBuilder message = new StringBuilder();

        // Append the message five times to the StringBuilder
        for (int i = 0; i < 5; i++) {
            message.append("Welcome to Java\n");
        }

        // Print the final accumulated message
        System.out.print(message.toString());
    }
}
