package com.arraysQuestions;

import java.util.LinkedList;
import java.util.List;

// Question and solution :https://leetcode.com/problems/add-to-array-form-of-integer/discuss/234558/JavaPython-3-6-liner-w-comment-and-analysis

public class AddingNumberToArrayFormOfInteger {

    public List<Integer> addToArrayForm(int[] A, int K) {

        List res = new LinkedList<>(); // lower complexity than arraylist
        for (int i = A.length - 1; i >= 0 || K > 0; --i) {
            // adding all at 0 index as if shifts automatically to right
            res.add(0, (i >= 0 ? A[i] + K : K) % 10);
            K = (i >= 0 ? A[i] + K : K) / 10;
        }
        return res;
    }
}
