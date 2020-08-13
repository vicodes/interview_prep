package com.DynamicProgramming;

// Question Link : https://www.techiedelight.com/subset-sum-problem/
public class SubsetSum {
    public static boolean subsetSum(int[] A, int sum)
    {
        int n = A.length;
        boolean[][] T = new boolean[n + 1][sum + 1];

        // if sum is zero
        for (int i = 0; i <= n; i++) {
            T[i][0] = true;
        }

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= sum; j++)
            {
                // don't include ith element if j-A[i-1] is negative
                if (A[i - 1] > j) {
                    T[i][j] = T[i - 1][j];
                }
                else {
                    // find subset with sum j by excluding or including the ith item
                    T[i][j] = T[i - 1][j] || T[i - 1][j - A[i - 1]];
                }
            }
        }
        return T[n][sum];
    }
}
