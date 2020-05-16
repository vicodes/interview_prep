package com.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class NQueen {

    public List<List<String>> solveNQueens(int n) {
        char[][] chess = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chess[i][j] = '.';
            }
        }
        List<List<String>> res = new ArrayList<List<String>>();

        solve(res, chess, 0);
        return res;
    }
    private void solve(List<List<String>> res, char[][] chess, int row) {
        if (row == chess.length) {
            res.add(construct(chess));
            return;
        }
        for (int col = 0; col < chess.length; col++) {
            if (valid(chess, row, col)) {
                chess[row][col] = 'Q';
                solve(res, chess, row + 1);
                chess[row][col] = '.';
            }
        }
    }

    private boolean valid(char[][] chess, int row, int col) {
        int N = chess.length;
        for (int i = 0; i < row; i++) {
            // check column
            if (chess[i][col] == 'Q') {
                return false;
            }
            // check diamond
            int rowDiff = row - i;
            if (col + rowDiff < N && chess[i][col + rowDiff] == 'Q') {
                return false;
            }
            if (col - rowDiff >= 0 && chess[i][col - rowDiff] == 'Q') {
                return false;
            }
        }
        return true;
    }

    private List<String> construct(char[][] chess) {
        List<String> path = new ArrayList<>();
        for (int i = 0; i < chess.length; i++) {
            path.add(new String(chess[i]));
        }
        return path;
    }
}

