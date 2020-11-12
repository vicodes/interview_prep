package com.arraysQuestions.PrefixSum;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/subarray-sum-equals-k/
//
public class SubArraySumEqualsK {

    public int subarraySum(int[] nums, int k) {
        int sum = 0, result = 0;
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result += preSum.getOrDefault(sum-k,0);
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }

        return result;
    }
}
// REASON FOR sum-k //
/*
//The idea is that you will calculate sum prefix of an array so my start is always
 0 and now my index is I5. currSum will have summation of array
from index 0 to index 5 let's say that this summation is 50 and I am searching for
 a summation = 20 so I won't increment the result. but as I store all prefix sum
 in the array . imagine that the sub array from 0 to I3 = 30.
this means that summation from 0-> I5 = 50 and summation from 0-> I3 = 30
so summation from (I3 -> I5) = 50-30 = 20 so this sub array should be added
 to my result too .*/
