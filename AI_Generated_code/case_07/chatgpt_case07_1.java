import java.util.Scanner;

public class MatrixDiagonalSum {

    // Method to calculate the sum of the major diagonal elements
    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0.0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];  // Add the leading diagonal elements (m[i][i])
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[][] matrix = new double[4][4];  // 4x4 matrix
        
        // Accept the matrix elements from the user
        System.out.println("Enter the elements of a 4x4 matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();  // Input for each element
            }
        }

        // Calculate the sum of the leading diagonal
        double diagonalSum = sumMajorDiagonal(matrix);
        
        // Output the sum of the diagonal
        System.out.println("Sum of the leading diagonal: " + diagonalSum);
        
        scanner.close();  // Close the scanner
    }
}
