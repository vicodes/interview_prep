package com.BackTracking;

import java.util.*;

//https://leetcode.com/problems/combination-sum-iii/discuss/60631/Fast-easy-Java-code-with-explanation!

public class CombinationSum3 {

    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] num = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        helper(result, new ArrayList<Integer>(), num, k, n,0);
        return result;
    }

    public void helper(List<List<Integer>> result, List<Integer> list, int[] num, int k, int target, int start) {
        if (k == 0 && target == 0) {
            result.add(new ArrayList<Integer>(list));
        } else {
            for (int i = start; i < num.length && target > 0 && k > 0; i++) {
                list.add(num[i]);
                helper(result, list, num, k - 1, target - num[i], i + 1);
                list.remove(list.size() - 1);
            }
        }
    }
}
