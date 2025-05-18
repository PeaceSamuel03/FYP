import java.util.Scanner;
import java.util.stream.IntStream;

public class MatrixDiagonalSumStreams {

    // Method to calculate the sum of the leading diagonal using Streams
    public static double sumMajorDiagonal(double[][] m) {
        return IntStream.range(0, m.length) // Generate indices 0 to 3
                .mapToDouble(i -> m[i][i]) // Extract diagonal elements
                .sum(); // Sum up all elements
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define a 4x4 matrix
        double[][] matrix = new double[4][4];

        // Prompt the user to enter a 4x4 matrix
        System.out.println("Enter a 4×4 matrix row by row:");

        // Read input into the matrix
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Calculate and display the sum of the major diagonal using Streams
        System.out.println("Sum of the elements on the leading diagonal: " + sumMajorDiagonal(matrix));

        scanner.close();
    }
}
