package com.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Input: candidates = [10,1,2,7,6,1,5], target = 8,
Output :[[1, 7],[1, 2, 5],[2, 6],[1, 1, 6]]  */

//Idea is to generate all combinations using recursion and check if it is valid
public class CombinationSum2 {

    public List<List<Integer>> combinationSum2(int[] cand, int target) {
        Arrays.sort(cand);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs_com(cand, 0, target, path, res);
        return res;
    }
    void dfs_com(int[] cand, int cur, int target, List<Integer> path, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList(path));
            return ;
        }
        if (target < 0) return;
        for (int i = cur; i < cand.length; i++){
            if(i > cur && cand[i] == cand[i-1]) continue; // skip duplicates
            path.add(cand[i]);
            dfs_com(cand, i + 1, target - cand[i], path, res);
            path.remove(path.size() - 1);
        }
    }
}
