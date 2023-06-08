public class MatrixExampleTwo {
    public static void printNegativeElements(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                if (num < 0) {
                    System.out.print(num + ", ");
                }
            }
        }
        System.out.println();
    }

    public static void printNegativeElementsInRow(int[][] matrix, int row) {
        for (int num : matrix[row]) {
            if (num < 0) {
                System.out.print(num + ", ");
            }
        }
        System.out.println();
    }

    public static void printNegativeElementsInColumn(int[][] matrix, int col) {
        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row][col] < 0) {
                System.out.print(matrix[row][col] + ", ");
            }
        }
        System.out.println();
    }

    public static void printDiagonalFromTopLeft(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + ", ");
        }
        System.out.println();
    }

    public static void printDiagonalFromBottomLeft(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[matrix.length - 1 - i][i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, -2, 3},
                {-4, 5, -6},
                {7, -8, 9}
        };

        printNegativeElements(matrix);
        printNegativeElementsInRow(matrix, 1);
        printNegativeElementsInColumn(matrix, 0);
        printDiagonalFromTopLeft(matrix);
        printDiagonalFromBottomLeft(matrix);
    }
}
