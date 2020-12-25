package com.DynamicProgramming.Knapsack01;

public class KnapsackRecursive {

    public static int knapSack(int[] v, int[] w, int n, int W)
    {
        if (W < 0) {
            return Integer.MIN_VALUE;
        }
        if (n < 0 || W == 0) {
            return 0;
        }

        int include = v[n] + knapSack(v, w, n - 1, W - w[n]);
        int exclude = knapSack(v, w, n - 1, W);

        return Integer.max(include, exclude);
    }
}
