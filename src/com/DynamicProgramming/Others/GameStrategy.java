package com.DynamicProgramming.Others;

// https://leetcode.com/problems/predict-the-winner/discuss/96838/Java-'1-Line'-Recursive-Solution-O(n2)-Time-and-O(n)-Space

public class GameStrategy {
    int[][] dp;

    public boolean PredictTheWinner(int[] nums) {
        dp = new int[nums.length][nums.length];
        return helper(nums, 0, nums.length-1,dp)>=0;

    }
    private int helper(int[] nums, int s, int e, int[][] dp){

        if(s==e)
            return nums[e];
        if(dp[s][e] !=0)
            return dp[s][e];

        else{
            int start = nums[s] - helper(nums, s+1, e,dp);
            int end = nums[e]- helper(nums, s, e-1,dp);
            return dp[s][e] = Math.max(start, end);
        }
    }
}