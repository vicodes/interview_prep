package com.DFS_BFS;

// Question Link : https://leetcode.com/problems/max-area-of-island/
// Similar to NumberOfIslands
public class IslandArea {

    private int n, m;

    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        n = grid.length;
        if(n == 0) return 0;
        m = grid[0].length;
        for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 1){
                    int count = dfsIsland(grid, i, j);
                    res = Math.max(res, count);
                }
            }
        }
        return res;
    }

    public int dfsIsland(int[][] grid, int i, int j){
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j] == 0) return 0;
        grid[i][j] = 0;
        return 1 + dfsIsland(grid, i+1, j) + dfsIsland(grid, i-1, j)+
                dfsIsland(grid, i, j+1) + dfsIsland(grid, i ,j-1);
    }

}
