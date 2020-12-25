package com.DynamicProgramming.MCM;

//https://www.geeksforgeeks.org/matrix-chain-multiplication-dp-8/
// Code modified by me.Reference Aditya Verma Youtube
public class MatrixChainMultiplication {

    static int matrixChainOrder(int p[], int i, int j, int[][] dp)
    {
        if (i == j)
            return 0;

        int min = Integer.MAX_VALUE;
        if(dp[i][j] != 0)
            return dp[i][j];

        // place parenthesis at different places between first and last matrix, recursively calculate
        // count of multiplications for each parenthesis placement and return the minimum count
        for (int k = i; k < j; k++)
        {
            int count = matrixChainOrder(p, i, k,dp) + matrixChainOrder(p, k + 1, j,dp) + p[i - 1] * p[k] * p[j];

            min = Math.min(min, count);
        }
        dp[i][j] = min;
        return min;
    }

    public static void main(String[] args) {
        int[] p = new int[]{1,2,3,4,3};
        int n = p.length;
        int[][] dp = new int[n+1][n+1];
        System.out.println(matrixChainOrder(p,1, n-1, dp));
    }
}
