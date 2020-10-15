package com.arraysQuestions;


// Question and solution : https://leetcode.com/problems/non-decreasing-array/discuss/106818/Java-solution-7-liner.

public class NonDecreasingArray {

    public boolean checkPossibility(int[] nums) {
        int n = nums.length, count = 0;

        for (int i = 0; i + 1 < n; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
                if (i > 0 && nums[i + 1] < nums[i - 1])
                    nums[i + 1] = nums[i];
                else
                    nums[i] = nums[i + 1];
            }
        }

        return count <= 1;
    }

}
