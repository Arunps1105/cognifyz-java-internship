import java.util.Scanner;

public class TicTacToeGame {

    static char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

    public static void printBoard() {
        System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("--+---+--");
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("--+---+--");
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
    }

    public static boolean checkWinner() {
        int[][] winPositions = {
                {0,1,2},{3,4,5},{6,7,8},
                {0,3,6},{1,4,7},{2,5,8},
                {0,4,8},{2,4,6}
        };

        for (int[] pos : winPositions) {
            if (board[pos[0]] != ' ' &&
                    board[pos[0]] == board[pos[1]] &&
                    board[pos[1]] == board[pos[2]]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char player = 'X';

        for (int i = 0; i < 9; i++) {

            printBoard();
            System.out.print("Player " + player + " enter position (1-9): ");
            int pos = sc.nextInt() - 1;

            if (board[pos] == ' ') {
                board[pos] = player;
            } else {
                System.out.println("Position already taken!");
                i--;
                continue;
            }

            if (checkWinner()) {
                printBoard();
                System.out.println("Player " + player + " wins!");
                return;
            }

            player = (player == 'X') ? 'O' : 'X';
        }

        printBoard();
        System.out.println("It's a draw!");

        sc.close();
    }
}