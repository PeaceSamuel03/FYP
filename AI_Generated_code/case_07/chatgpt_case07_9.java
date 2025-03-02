import java.util.Scanner;

public class MatrixDiagonalSum {

    // Method to calculate the sum of the leading diagonal
    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0.0;
        
        // Loop through the matrix and sum up the diagonal elements (i == j)
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];  // Add matrix element at (i, i) to the sum
        }
        
        return sum;  // Return the total sum of the diagonal
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare and initialize the 4x4 matrix
        double[][] matrix = new double[4][4];

        // Accept the matrix elements from the user
        System.out.println("Enter the elements of a 4x4 matrix:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();  // Input each element of the matrix
            }
        }

        // Call the sumMajorDiagonal method to calculate the sum of the leading diagonal
        double diagonalSum = sumMajorDiagonal(matrix);

        // Output the sum of the diagonal
        System.out.println("Sum of the leading diagonal: " + diagonalSum);

        scanner.close();  // Close the scanner
    }
}
