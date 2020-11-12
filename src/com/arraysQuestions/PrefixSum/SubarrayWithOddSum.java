package com.arraysQuestions.PrefixSum;

// https://leetcode.com/problems/number-of-sub-arrays-with-odd-sum/discuss/754909/Java-O(n)-time-and-O(1)-space

public class SubarrayWithOddSum {

    public int numOfSubarrays(int[] arr) {
        int odd = 0, even = 1, res = 0, sum = 0, mod = 1_000_000_007; // treat empty subarray as even
        for (int n : arr) {
            sum += n;
            if (sum % 2 == 0) {
                even++;
                res = (res + odd) % mod;
            } else {
                odd++;
                res = (res + even) % mod;
            }
        }
        return res;
    }


}
