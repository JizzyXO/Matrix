public class MatrixSearch {
    public static void findElementInRow(int[][] matrix, int row, int element) {
        for (int col = 0; col < matrix[row].length; col++) {
            if (matrix[row][col] == element) {
                System.out.println("Element " + element + " found in row " + row);
                return;
            }
        }
        System.out.println("Element " + element + " not found in row " + row);
    }

    public static void findElementInColumn(int[][] matrix, int col, int element) {
        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row][col] == element) {
                System.out.println("Element " + element + " found in column " + col);
                return;
            }
        }
        System.out.println("Element " + element + " not found in column " + col);
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };

        int element = 5;
        findElementInRow(matrix, 1, element);
        findElementInColumn(matrix, 2, element);
    }
}
