package com.SlidingWindow;

// https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/
// Contiguos subarray
public class AverageGreaterThanSubarray {

    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int t = k * threshold, s = 0, cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
            if (i < k - 1) continue;
            if (i > k - 1) s -= arr[i - k];
            if (s >= t) cnt++;
        }
        return cnt;
    }

}
