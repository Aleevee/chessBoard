import java.util.Random;
import java.util.Scanner;

public class ChessGame {
    private static char[][] chessboard = {
            {'♖', '♘', '♗', '♔', '♕', '♗', '♘', '♖'},
            {'♙', '♙', '♙', '♙', '♙', '♙', '♙', '♙'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'♟', '♟', '♟', '♟', '♟', '♟', '♟', '♟'},
            {'♜', '♞', '♝', '♚', '♛', '♝', '♞', '♜'}
    };

    public static void displayBoard() {
        System.out.println("  a  b  c  d  e  f  g  h");
        for (int row = 0; row < 8; row++) {
            System.out.print(8 - row + " ");
            for (int col = 0; col < 8; col++) {
                System.out.print("|" + chessboard[row][col] + "|");
            }
            System.out.println();
        }
    }

    public static boolean isValidMove(String move) {
        if (move.matches("[a-h][1-8][a-h][1-8]")) {
            int srcRow = 8 - (move.charAt(1) - '0');
            int srcCol = move.charAt(0) - 'a';
            int destRow = 8 - (move.charAt(3) - '0');
            int destCol = move.charAt(2) - 'a';
            return srcRow >= 0 && srcRow < 8 && srcCol >= 0 && srcCol < 8
                    && destRow >= 0 && destRow < 8 && destCol >= 0 && destCol < 8
                    && chessboard[srcRow][srcCol] != '-'; // Ensure source cell has a piece
        }
        return false;
    }

    public static void makeMove(String move) {
        int srcRow = 8 - (move.charAt(1) - '0');
        int srcCol = move.charAt(0) - 'a';
        int destRow = 8 - (move.charAt(3) - '0');
        int destCol = move.charAt(2) - 'a';
        chessboard[destRow][destCol] = chessboard[srcRow][srcCol];
        chessboard[srcRow][srcCol] = '-';
    }

    public static void botMove() {
        Random random = new Random();
        int srcRow, srcCol, destRow, destCol;

        do {
            srcRow = random.nextInt(8);
            srcCol = random.nextInt(8);
            destRow = random.nextInt(8);
            destCol = random.nextInt(8);
        } while (chessboard[srcRow][srcCol] == '-');

        String botMove = "" + (char) ('a' + srcCol) + (8 - srcRow) + (char) ('a' + destCol) + (8 - destRow);
        System.out.println("Bot move: " + botMove);
        makeMove(botMove);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayBoard();

            System.out.print("Enter your move (e.g., a2a4): ");
            String playerMove = scanner.nextLine();

            if (isValidMove(playerMove)) {
                makeMove(playerMove);
                botMove();
            } else {
                System.out.println("Invalid move!");
            }
        }
    }
}
