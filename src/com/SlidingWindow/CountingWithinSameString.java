package com.SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Actual  Question : https://leetcode.com/problems/positions-of-large-groups/discuss/128961/Java-Solution-Two-Pointers

// Find substring of length greater than 3 within string
// done using two pointers
public class CountingWithinSameString {

    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> ans = new ArrayList<>();
        int start = 0;
        for (int i = 1; i <= S.length(); i++) {
            if (i == S.length() || S.charAt(i) != S.charAt(start)) {
                if (i - start >= 3) {
                    ans.add(Arrays.asList(start, i - 1));
                }
                start = i;
            }
        }
        return ans;
    }
}
