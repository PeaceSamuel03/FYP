import java.util.Scanner;

public class MatrixDiagonalSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[][] matrix = new double[4][4];  // 4x4 matrix
        double diagonalSum = 0.0;  // Variable to store the sum of the leading diagonal
        
        // Accept the matrix elements from the user
        System.out.println("Enter the elements of a 4x4 matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();  // Input for each element
            }
        }

        // Calculate the sum of the leading diagonal directly in the main method
        for (int i = 0; i < 4; i++) {
            diagonalSum += matrix[i][i];  // Add the diagonal element (i, i)
        }
        
        // Output the sum of the diagonal
        System.out.println("Sum of the leading diagonal: " + diagonalSum);
        
        scanner.close();  // Close the scanner
    }
}
