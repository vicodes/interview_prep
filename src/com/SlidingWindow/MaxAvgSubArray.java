package com.SlidingWindow;

// Question and solution : https://leetcode.com/problems/maximum-average-subarray-i/discuss/105432/Java-solution-Sum-of-Sliding-window

public class MaxAvgSubArray {

    public double findMaxAverage(int[] nums, int k) {
        long sum = 0;
        for (int i = 0; i < k; i++) sum += nums[i];
        long max = sum;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            max = Math.max(max, sum);
        }

        return max / 1.0 / k;
    }

}
