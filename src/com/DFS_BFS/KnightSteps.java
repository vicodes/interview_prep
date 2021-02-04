package com.DFS_BFS;

import java.util.*;

// Java program to find minimum steps to reach to specific cell in minimum moves by Knight
// https://www.geeksforgeeks.org/minimum-steps-reach-target-knight/
class KnightSteps
{

    // Class for storing a cell's data
    static class Cell
    {
        int x, y;
        int dist;
        public Cell(int x, int y, int dist)
        {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    static int minStepToReachTarget(int knightPos[], int targetPos[],
                                    int N)
    {
        // x and y direction, where a knight can move
        int dx[] = {-2, -1, 1, 2, -2, -1, 1, 2};
        int dy[] = {-1, -2, -2, -1, 1, 2, 2, 1};

        // queue for storing states of knight in board
        Queue<Cell> queue = new LinkedList<>();
        queue.add(new Cell(knightPos[0], knightPos[1], 0));
        boolean visit[][] = new boolean[N + 1][N + 1];
        visit[knightPos[0]][knightPos[1]] = true;

        while (!queue.isEmpty())
        {
            Cell cell = queue.poll();

            // if current cell is equal to target cell,
            // return its distance
            if (cell.x == targetPos[0] && cell.y == targetPos[1])
                return cell.dist;

            // loop for all reachable states
            for (int i = 0; i < 8; i++) {
                int x = cell.x + dx[i];
                int y = cell.y + dy[i];

                if (x >= 1 && x <= N && y >= 1 && y <= N && !visit[x][y]) {
                    visit[x][y] = true;
                    queue.add(new Cell(x, y, cell.dist + 1));
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args)
    {
        int N = 30;
        int knightPos[] = {1, 1};
        int targetPos[] = {30, 30};
        System.out.println(minStepToReachTarget(knightPos, targetPos, N));
    }
}
