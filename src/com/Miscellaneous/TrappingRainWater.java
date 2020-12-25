package com.Miscellaneous;

// https://leetcode.com/problems/trapping-rain-water/discuss/17357/Sharing-my-simple-c%2B%2B-code%3A-O(n)-time-O(1)-space
// O(N) time and O(N) space solution.

// Below solution from-- https://www.techiedelight.com/trapping-rain-water-within-given-set-bars/
public class TrappingRainWater {

    public static int trap(int[] bars)
    {
        int n = bars.length;
        int water = 0;

        int[] left = new int[n-1];
        left[0] = Integer.MIN_VALUE;

        // process bars from left to right
        for (int i = 1; i < n - 1; i++) {
            left[i] = Integer.max(left[i - 1], bars[i - 1]);
        }

        int right = Integer.MIN_VALUE;

        for (int i = n - 2; i >= 1; i--) {
            right = Integer.max(right, bars[i + 1]);

            if (Integer.min(left[i], right) > bars[i]) {
                water += Integer.min(left[i], right) - bars[i];
            }
        }

        return water;
    }

}
