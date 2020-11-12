package com.SlidingWindow;

// https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/discuss/708112/JavaC%2B%2BPython-Sliding-Window-at-most-one-0

// Similar : https://leetcode.com/problems/max-consecutive-ones-iii/

public class LongestSubarrayAfterDeleting {

    public int longestSubarray(int[] nums) {
        int res = 0;
        int left = 0;
        int numOfZeros = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                numOfZeros++;
            }
            while (numOfZeros > 1) {
                if (nums[left++] == 0) {
                    numOfZeros--;
                }
            }
            res = Math.max(res, right - left);
        }
        return res;
    }
}
