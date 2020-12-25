package com.arraysQuestions;

import java.util.LinkedList;
import java.util.List;

// Question and solution :https://leetcode.com/problems/add-to-array-form-of-integer/discuss/234558/JavaPython-3-6-liner-w-comment-and-analysis

public class AddingNumberToArrayFormOfInteger {

    public List<Integer> addToArrayForm(int[] A, int K) {

        List<Integer> res = new LinkedList<>(); // LinkedList used as insert operation has less time complexity

        for (int i = A.length - 1; i >= 0; --i) {
            res.add(0, (A[i] + K) % 10); // LinkedList keeps pushing elements back hence adding in front
            K = (A[i] + K) / 10;
        }

        while (K > 0) {
            res.add(0, K % 10);
            K /= 10;
        }
        return res;
    }
}
