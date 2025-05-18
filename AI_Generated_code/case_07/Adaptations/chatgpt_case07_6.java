import java.util.Scanner;

public class MatrixDiagonalSum {

    // Function to input the matrix
    public static double[][] inputMatrix(Scanner scanner, int rows, int cols) {
        double[][] matrix = new double[rows][cols];  // Create the matrix

        System.out.println("Enter the elements of a " + rows + "x" + cols + " matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();  // Input matrix elements
            }
        }
        return matrix;  // Return the populated matrix
    }

    // Function to calculate the sum of the leading diagonal
    public static double sumMajorDiagonal(double[][] matrix) {
        double sum = 0.0;
        int rows = matrix.length;  // Number of rows in the matrix (assuming square matrix)
        
        // Loop through the matrix and sum the leading diagonal elements
        for (int i = 0; i < rows; i++) {
            sum += matrix[i][i];  // Add the element at (i, i) to sum
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define matrix dimensions (4x4 in this case)
        int rows = 4;
        int cols = 4;

        // Call inputMatrix function to get the 4x4 matrix from user
        double[][] matrix = inputMatrix(scanner, rows, cols);

        // Call sumMajorDiagonal function to get the sum of the leading diagonal
        double diagonalSum = sumMajorDiagonal(matrix);

        // Output the sum of the diagonal
        System.out.println("Sum of the leading diagonal: " + diagonalSum);
        
        scanner.close();  // Close the scanner
    }
}
