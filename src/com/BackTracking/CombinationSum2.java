package com.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/combination-sum-ii/

public class CombinationSum2 {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] cand, int target) {
        Arrays.sort(cand);
        List<Integer> path = new ArrayList<>();
        dfs_com(cand, 0, target, path);
        return res;
    }
    void dfs_com(int[] cand, int start, int target, List<Integer> tempList) {
        if (target == 0) {
            res.add(new ArrayList(tempList));
            return ;
        }
        if (target < 0) return;
        for (int i = start; i < cand.length; i++){
            if(i > start && cand[i] == cand[i-1]) continue; // skip duplicates
            tempList.add(cand[i]);
            dfs_com(cand, i + 1, target - cand[i], tempList);
            tempList.remove(tempList.size() - 1);
        }
    }
}
