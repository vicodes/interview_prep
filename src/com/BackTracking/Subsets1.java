package com.BackTracking;

import java.util.ArrayList;
import java.util.List;
// Question :  https://leetcode.com/problems/subsets/
//https://leetcode.com/problems/subsets/discuss/27281/A-general-approach-to-backtracking-questions-in-Java-(Subsets-Permutations-Combination-Sum-Palindrome-Partitioning)
public class Subsets1 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {

        backtrack(new ArrayList<>(), nums, 0);
        return res;
    }

    private void backtrack(List<Integer> tempList, int [] nums, int start){
        res.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums  = new int[]{1,2,3};
        Subsets1 sr = new Subsets1();
        List<List<Integer>> temp = sr.subsets(nums);
    }
}
