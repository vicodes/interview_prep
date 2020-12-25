package com.DynamicProgramming.MCM;

//https://leetcode.com/problems/palindrome-partitioning-ii/submissions/
// Solution is inspired from one of leetcode solution and Aditya Verma YT
public class PalindromePartition {

    private Boolean dpIsPalindrome[][];

    public int minCut(String s) {

        int n = s.length();
        int dp[][] = new int[n+1][n+1];
        dpIsPalindrome = new Boolean[n][n];
        return findMinCuts(s,0, n-1,dp);
    }

    private int findMinCuts(String str, int i ,int j,int [][] dp){

        if(i >= j || isPalindrome(str, i, j)) return 0;

        if(dp[i][j] != 0) return dp[i][j];

        int res = Integer.MAX_VALUE;
        for(int k = i; k < j; k++){

            if(isPalindrome(str,i,k)){
                int temp = 1  + findMinCuts(str, k+1, j,dp);

                res = Math.min(res, temp);
            }
        }
        dp[i][j] = res;
        return res;
    }

    private boolean isPalindrome(String s, int start, int end) {
        // memoize palindrome as well to reduce time complexity
        if (start >= end)
            return true;

        if (dpIsPalindrome[start][end] != null)
            return dpIsPalindrome[start][end];

        return dpIsPalindrome[start][end] = (s.charAt(start) == s.charAt(end))
                && isPalindrome(s, start + 1, end - 1);
    }

}
