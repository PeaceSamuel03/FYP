import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define matrix size
        final int SIZE = 4;
        double[][] matrix = new double[SIZE][SIZE];

        // Get user input for the matrix
        System.out.println("Please enter a 4×4 matrix row by row:");

        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                matrix[row][col] = scanner.nextDouble();
            }
        }

        // Compute and display the diagonal sum
        System.out.println("Sum of the leading diagonal: " + sumMajorDiagonal(matrix));

        scanner.close();
    }

    // Method to calculate the sum of diagonal elements
    public static double sumMajorDiagonal(double[][] matrix) {
        double total = 0;
        int size = matrix.length; // Store size to avoid repeated calls
        for (int i = 0; i < size; i++) {
            total += matrix[i][i];
        }
        return total;
    }
}
