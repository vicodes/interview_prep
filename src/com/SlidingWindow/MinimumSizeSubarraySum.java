package com.SlidingWindow;

// https://leetcode.com/problems/minimum-size-subarray-sum/
public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int s, int[] nums) {

        if(nums.length == 0) return 0;

        int sum = 0, res = Integer.MAX_VALUE, left = 0;
        for(int right = 0; right<nums.length; right++){
            sum += nums[right];

            while(sum >= s){
                res = Math.min(res, right - left+1);
                sum -= nums[left++];
            }

        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }

}
// Time complexity - O(2n)--> O(n).
// It seems like that two while or one while and one for loops give O(N^2).
// But actually, for every j, i is not starting from 0. Pointer i will not go back,
// so in the worst case, pointer j moves forward n times and pointer i also moves
// forward n times.