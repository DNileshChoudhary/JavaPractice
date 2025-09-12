import java.util.*;

public class ChessGame {

    private static final int SIZE = 4; // 4x4 grid
    private static int[][] board = new int[SIZE][SIZE]; // Game board
    private static int emptyRow = SIZE - 1; // Empty space is at bottom-right corner initially
    private static int emptyCol = SIZE - 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize the board
        initializeBoard();

        // Play the game
        while (true) {
            printBoard();
            System.out.println("Enter your move (W = Up, A = Left, S = Down, D = Right, Q = Quit):");
            String move = scanner.nextLine().toUpperCase();

            if (move.equals("Q")) {
                System.out.println("You quit the game!");
                break;
            }

            if (isValidMove(move)) {
                makeMove(move);
                if (isSolved()) {
                    printBoard();
                    System.out.println("Congratulations, you solved the puzzle!");
                    break;
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
        scanner.close();
    }

    // Initialize the board with numbers 1 to 15 and one empty space
    private static void initializeBoard() {
        int number = 1;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i == SIZE - 1 && j == SIZE - 1) {
                    board[i][j] = 0; // Empty space
                } else {
                    board[i][j] = number++;
                }
            }
        }
    }

    // Print the current board state
    private static void printBoard() {
        System.out.println("Current board:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == 0) {
                    System.out.print("   "); // Empty space
                } else {
                    System.out.print(board[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }

    // Check if the move is valid
    private static boolean isValidMove(String move) {
        switch (move) {
            case "W": // Up
                return emptyRow > 0;
            case "A": // Left
                return emptyCol > 0;
            case "S": // Down
                return emptyRow < SIZE - 1;
            case "D": // Right
                return emptyCol < SIZE - 1;
            default:
                return false;
        }
    }

    // Make the move
    private static void makeMove(String move) {
        int newRow = emptyRow;
        int newCol = emptyCol;

        switch (move) {
            case "W": // Move up
                newRow--;
                break;
            case "A": // Move left
                newCol--;
                break;
            case "S": // Move down
                newRow++;
                break;
            case "D": // Move right
                newCol++;
                break;
        }

        // Swap the empty space with the number tile
        board[emptyRow][emptyCol] = board[newRow][newCol];
        board[newRow][newCol] = 0;

        // Update the empty space position
        emptyRow = newRow;
        emptyCol = newCol;
    }

    // Check if the board is in the solved state
    private static boolean isSolved() {
        int number = 1;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i == SIZE - 1 && j == SIZE - 1) {
                    return board[i][j] == 0; // The last space should be empty
                }
                if (board[i][j] != number++) {
                    return false;
                }
            }
        }
        return true;
    }
}
