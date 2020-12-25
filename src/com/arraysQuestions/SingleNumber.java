package com.arraysQuestions;

// https://leetcode.com/problems/single-number/
// XOR logic is used.
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int ans =0;

        int len = nums.length;
        for(int i=0;i!=len;i++)
            ans ^= nums[i];

        return ans;

    }

}
