package com.DynamicProgramming.LongestIncreasingSubsType;

//Done using DP in O(n^2) time. Can be Done in O(nlogn)
//Question/Soln Link : https://www.techiedelight.com/longest-increasing-subsequence-using-dynamic-programming/
//Document is  there for understanding best

import java.util.Arrays;

public class LongestIncreasingSubsequence {

    static int lis(int arr[],int n)
    {
        int lis[] = new int[n];
        int i,j,max = 0;

        /* Initialize LIS values for all indexes */
        Arrays.fill(lis,1);

           /* Compute optimized LIS values in bottom up manner */
        for ( i = 1; i < n; i++ )
            for ( j = 0; j < i; j++ )
                if ( arr[i] > arr[j] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;

        /* Pick maximum of all LIS values */
        for ( i = 0; i < n; i++ )
            if ( max < lis[i] )
                max = lis[i];

        return max;
    }

}
