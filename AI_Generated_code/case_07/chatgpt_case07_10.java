import java.util.Scanner;

public class MatrixDiagonalSum {

    // Method to input the matrix elements and return the matrix
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare and initialize the 4x4 matrix
        double[][] matrix = new double[4][4];
        double diagonalSum = 0.0;

        // Accept the matrix elements from the user
        System.out.println("Enter the elements of a 4x4 matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();  // Input for each element
                
                // If it's on the leading diagonal, add it to the sum
                if (i == j) {
                    diagonalSum += matrix[i][j];
                }
            }
        }

        // Output the sum of the diagonal
        System.out.println("Sum of the leading diagonal: " + diagonalSum);

        scanner.close();  // Close the scanner
    }
}
