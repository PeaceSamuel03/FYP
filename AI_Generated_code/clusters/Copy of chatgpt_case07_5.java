import java.util.Scanner;

public class MatrixDiagonalSum {

    // Matrix class to store the 4x4 matrix and provide sum calculation
    static class Matrix {
        double[][] matrix;

        // Constructor to initialize the matrix
        public Matrix(int rows, int cols) {
            matrix = new double[rows][cols];
        }

        // Method to input matrix values
        public void inputMatrix(Scanner scanner) {
            System.out.println("Enter the elements of a 4x4 matrix:");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print("Element at [" + i + "][" + j + "]: ");
                    matrix[i][j] = scanner.nextDouble();  // Input for each element
                }
            }
        }

        // Method to calculate the sum of the leading diagonal
        public double sumMajorDiagonal() {
            double sum = 0.0;
            for (int i = 0; i < 4; i++) {
                sum += matrix[i][i];  // Add the diagonal element (i, i)
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create a Matrix object with a 4x4 size
        Matrix matrix = new Matrix(4, 4);
        
        // Accept matrix elements from the user
        matrix.inputMatrix(scanner);
        
        // Calculate the sum of the leading diagonal
        double diagonalSum = matrix.sumMajorDiagonal();
        
        // Output the sum of the diagonal
        System.out.println("Sum of the leading diagonal: " + diagonalSum);
        
        scanner.close();  // Close the scanner
    }
}
