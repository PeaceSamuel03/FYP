import java.util.Scanner;

public class MatrixDiagonalSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare and initialize the 4x4 matrix
        double[][] matrix = new double[4][4];
        double diagonalSum = 0.0;

        // Accept the matrix elements and calculate the diagonal sum in a single loop
        System.out.println("Enter the elements of a 4x4 matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();  // Input for each element
                
                // If we're on the leading diagonal (i == j), add to the sum
                if (i == j) {
                    diagonalSum += matrix[i][j];  // Add the diagonal element to the sum
                }
            }
        }

        // Output the sum of the diagonal
        System.out.println("Sum of the leading diagonal: " + diagonalSum);

        scanner.close();  // Close the scanner
    }
}
