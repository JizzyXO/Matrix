import java.util.Arrays;
import java.util.Random;

public class BattleshipGame {
    private static final int SIZE = 10;
    private static final int[][] board = new int[SIZE][SIZE];

    public static void placeShip(int length) {
        Random random = new Random();
        boolean isHorizontal = random.nextBoolean();

        int row, col;
        if (isHorizontal) {
            do {
                row = random.nextInt(SIZE);
                col = random.nextInt(SIZE - length + 1);
            } while (!isAvailable(row, col, length, true));
            for (int i = col; i < col + length; i++) {
                board[row][i] = 1;
            }
        } else {
            do {
                row = random.nextInt(SIZE - length + 1);
                col = random.nextInt(SIZE);
            } while (!isAvailable(row, col, length, false));
            for (int i = row; i < row + length; i++) {
                board[i][col] = 1;
            }
        }
    }

    public static boolean isAvailable(int row, int col, int length, boolean isHorizontal) {
        if (isHorizontal) {
            for (int i = col; i < col + length; i++) {
                if (board[row][i] != 0) {
                    return false;
                }
            }
        } else {
            for (int i = row; i < row + length; i++) {
                if (board[i][col] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void placeShips() {
        for (int i = 0; i < 10; i++) {
            placeShip(1); // One-deck ships
        }
        for (int i = 0; i < 10; i++) {
            placeShip(2); // Two-deck ships
        }
        for (int i = 0; i < 5; i++) {
            placeShip(3); // Three-deck ships
        }
        placeShip(4); // Four-deck ship
    }

    public static void printBoard() {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        placeShips();
        printBoard();
    }
}
