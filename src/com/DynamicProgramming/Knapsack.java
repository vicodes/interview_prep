package com.DynamicProgramming;

// Question Link : https://www.geeksforgeeks.org/0-1-knapsack-problem-dp-10/
// Memoized solution is also good -  https://www.techiedelight.com/0-1-knapsack-problem/
public class Knapsack {

    static int knapSack(int W, int wt[], int val[], int n)
    {
        int i, w;
        int K[][] = new int[n + 1][W + 1];

        // Build table K[][] in bottom up manner
        for (i = 0; i <= n; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                // (i-1) because of array based indexing from 0
                else if (wt[i - 1] <= w)
                    K[i][w] = Math.max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }
        return K[n][W];
    }

}
