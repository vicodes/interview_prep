package com.DynamicProgramming.LongestCommon;

// https://leetcode.com/problems/longest-palindromic-subsequence/submissions/
// Logic by Aditya Verma Youtube
public class LongestPalidromicSubsequence {

    public int longestPalindromeSubseq(String s) {

        int n = s.length();
        int[][] dp = new int[n+1][n+1];

        StringBuilder str = new StringBuilder(s);
        String rev = str.reverse().toString();

        for(int i=0; i<=n; i++){
            for(int j = 0; j<=n; j++){

                if(i == 0 || j== 0)
                    dp[i][j] = 0;

                else if(s.charAt(i-1) == rev.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1] + 1;
                else
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
        return dp[n][n];
    }

}
