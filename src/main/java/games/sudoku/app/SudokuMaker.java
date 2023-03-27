package com.example.demo.app;

import java.util.*;

import static java.util.Collections.shuffle;

public class SudokuMaker {
    public static int[][] generateSolvedSudoku() {
        int[][] board = new int[9][9];
        ArrayList<Integer> row1 = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            row1.add(i);
        }
        Collections.shuffle(row1);

        // Fill in the first row
        for (int i = 0; i < 9; i++) {
            board[0][i] = row1.get(i);
        }

        // Fill in the rest of the puzzle using backtracking
        SudokuSolver.solve(board);
        return board;
    }

    public static int[][] generateUnsolvedSudoku(HardLevel level) {
        int[][] board = generateSolvedSudoku();
        Random random = new Random();
        for (int i = 0; i < level.hardLevel; i++) {
            for (int j = 0; j < 9; j++) {
                board[j][random.nextInt(9)] = 0;
            }
        }
        return board;
    }
}
