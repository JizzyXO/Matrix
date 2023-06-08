public class MatrixExample {
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + ", ");
            }
            System.out.println();
        }
        System.out.println("-----------");
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {4, 3, 2, 1},
                {8, 7, 6, 5},
                {12, 11, 10, 9}
        };

        printMatrix(matrix);
    }
}
