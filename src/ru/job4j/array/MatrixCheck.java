package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean isWin = true;
        for (int cell = 0; cell < board[row].length; cell++) {
            if (board[row][cell] != 'X') {
                isWin = false;
                break;
            }
        }
        return isWin;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean isWin = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != 'X') {
                isWin = false;
                break;
            }
        }
        return isWin;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] diagonal = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            diagonal[i] = board[i][i];
        }
        return diagonal;
    }

    public static boolean isWin(char[][] board) {
        boolean isWin = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
               if (monoHorizontal(board, i) || monoVertical(board, i)) {
                   isWin = true;
                   break;
               }
            }
        }
        return isWin;
    }
}
