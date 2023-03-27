package com.example.demo.app;

import java.util.Arrays;
import java.util.Random;

public class SudokuSolver {

    public static boolean solve(int[][] board) {
        int row = -1;
        int col = -1;
        boolean isEmpty = true;

        // Find the next empty cell in the board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty) {
                break;
            }
        }

        // If there are no empty cells, the puzzle is solved
        if (isEmpty) {
            return true;
        }

        // Try placing each number 1-9 in the empty cell
        for (int num = 1; num <= 9; num++) {
            if (isValid(board, row, col, num)) {
                board[row][col] = num;
                if (solve(board)) {
                    return true;
                }
                board[row][col] = 0; // Backtrack
            }
        }

        // If no number works, backtrack and return false
        return false;
    }

    public static boolean isValid(int[][] board, int row, int col, int num) {
        // Check row
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == num) {
                return false;
            }
        }

        // Check column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // Check sub-grid
        int subgridRow = row - row % 3;
        int subgridCol = col - col % 3;
        for (int i = subgridRow; i < subgridRow + 3; i++) {
            for (int j = subgridCol; j < subgridCol + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        // Number is valid
        return true;
    }

    public static String giveHint(int[][] board){
        Random random = new Random();
        int[][] solvedBoard = new int[board.length][];
        for (int i = 0; i < board.length; i++) {
            solvedBoard[i] = Arrays.copyOf(board[i], board[i].length);
        }
        solve(solvedBoard);
        int x = -1;
        int y = -1;
        while (true){
            x = random.nextInt(9);
            y = random.nextInt(9);
            if (board[x][y] == 0) {
                board[x][y] = solvedBoard[x][y];
                break;
            }
        }
        return x + " " + y;
    }
}
