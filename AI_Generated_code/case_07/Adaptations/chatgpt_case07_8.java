import java.util.Scanner;

public class MatrixDiagonalSum {

    // Method to input matrix elements and return the matrix
    public static double[][] inputMatrix(Scanner scanner, int rows, int cols) {
        double[][] matrix = new double[rows][cols];  // Initialize the matrix

        System.out.println("Enter the elements of a " + rows + "x" + cols + " matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();  // Input for each element
            }
        }
        return matrix;  // Return the populated matrix
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare the matrix dimensions (4x4 in this case)
        int rows = 4;
        int cols = 4;

        // Input the matrix elements
        double[][] matrix = inputMatrix(scanner, rows, cols);

        // Variable to store the sum of the leading diagonal
        double diagonalSum = 0.0;

        // Calculate the sum of the leading diagonal
        for (int i = 0; i < rows; i++) {
            diagonalSum += matrix[i][i];  // Add the diagonal element (i, i) to the sum
        }

        // Output the sum of the leading diagonal
        System.out.println("Sum of the leading diagonal: " + diagonalSum);

        scanner.close();  // Close the scanner
    }
}
