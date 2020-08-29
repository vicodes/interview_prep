package com.DynamicProgramming.KnapsackType;

//Question Link and solution : https://leetcode.com/problems/partition-equal-subset-sum/discuss/90639/Java-Solution-similar-to-'Subset-Sum-Problem'


public class PartitionEqualSubsetSum {

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num: nums) sum += num;
        if(sum % 2 == 1) return false;

        int target = sum / 2;
        boolean[][] dp = new boolean[nums.length][target + 1];
        // deal with the first row
        if(nums[0] <= target) dp[0][nums[0]] = true;

        // deal with the first col
        for(int i = 0; i < nums.length; i++) dp[i][0] = true;

        // deal with the rest
        for(int i = 1; i < dp.length; i++) {
            for(int j = 1; j < dp[0].length; j++) {
                if(j < nums[i]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i]];
                    // [j-nums[i] as we subtract from current sum and go back and check value there.
                }
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}
