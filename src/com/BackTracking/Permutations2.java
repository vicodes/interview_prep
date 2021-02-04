package com.BackTracking;

import java.util.*;

// Question : https://leetcode.com/problems/permutations-ii/
// Solution : https://leetcode.com/problems/permutations/discuss/18239/A-general-approach-to-backtracking-questions-in-Java-(Subsets-Permutations-Combination-Sum-Palindrome-Partioning)
public class Permutations2 {

    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        permuteBacktrack(nums, res, new ArrayList<>(), new boolean[nums.length]);
        Set<List<Integer>> temp = new HashSet<>(res);
        res.clear();
        res.addAll(temp);
        return res;
    }

    public void permuteBacktrack(int[] nums, List<List<Integer>> res,  List<Integer> templist
            , boolean[] added){

        if(templist.size() == nums.length){
            res.add(new ArrayList<>(templist));
            return;
        }
        else{

            for(int i=0; i<nums.length; i++){
                if(added[i] == true) continue;
                templist.add(nums[i]);
                added[i] = true;
                permuteBacktrack(nums, res, templist,added);
                templist.remove(templist.size()-1);
                added[i] = false;
            }
        }
    }

}
