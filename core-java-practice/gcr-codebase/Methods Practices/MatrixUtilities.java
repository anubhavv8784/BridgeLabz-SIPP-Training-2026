import java.util.Random;

public class MatrixUtilities {
    public static void main(String[] args) {
        double[][] matrix2x2 = generateRandomMatrix(2, 2);
        double[][] matrix3x3 = generateRandomMatrix(3, 3);

        System.out.println("2x2 Matrix:");
        displayMatrix(matrix2x2);
        System.out.println("Transpose of 2x2 Matrix:");
        displayMatrix(transpose(matrix2x2));
        System.out.println("Determinant of 2x2 Matrix: " + determinant2x2(matrix2x2));
        System.out.println("Inverse of 2x2 Matrix:");
        displayMatrix(inverse2x2(matrix2x2));

        System.out.println("3x3 Matrix:");
        displayMatrix(matrix3x3);
        System.out.println("Transpose of 3x3 Matrix:");
        displayMatrix(transpose(matrix3x3));
        System.out.println("Determinant of 3x3 Matrix: " + determinant3x3(matrix3x3));
        System.out.println("Inverse of 3x3 Matrix:");
        displayMatrix(inverse3x3(matrix3x3));
    }

    public static double[][] generateRandomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        return matrix;
    }

    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transposed = new double[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static double determinant2x2(double[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    public static double determinant3x3(double[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    public static double[][] inverse2x2(double[][] matrix) {
        double det = determinant2x2(matrix);
        if (det == 0) {
            return new double[0][0];
        }
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / det;
        inverse[0][1] = -matrix[0][1] / det;
        inverse[1][0] = -matrix[1][0] / det;
        inverse[1][1] = matrix[0][0] / det;
        return inverse;
    }

    public static double[][] inverse3x3(double[][] matrix) {
        double det = determinant3x3(matrix);
        if (det == 0) {
            return new double[0][0];
        }
        double[][] cofactor = new double[3][3];
        cofactor[0][0] = matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1];
        cofactor[0][1] = -(matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]);
        cofactor[0][2] = matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0];
        cofactor[1][0] = -(matrix[0][1] * matrix[2][2] - matrix[0][2] * matrix[2][1]);
        cofactor[1][1] = matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0];
        cofactor[1][2] = -(matrix[0][0] * matrix[2][1] - matrix[0][1] * matrix[2][0]);
        cofactor[2][0] = matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1];
        cofactor[2][1] = -(matrix[0][0] * matrix[1][2] - matrix[0][2] * matrix[1][0]);
        cofactor[2][2] = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        double[][] adjoint = transpose(cofactor);
        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = adjoint[i][j] / det;
            }
        }
        return inverse;
    }

    public static void displayMatrix(double[][] matrix) {
        if (matrix.length == 0) {
            System.out.println("No inverse exists.");
            return;
        }
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%.2f ", value);
            }
            System.out.println();
        }
    }
}
