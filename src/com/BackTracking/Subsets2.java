package com.BackTracking;
import java.util.*;

//https://leetcode.com/problems/subsets-ii/submissions/
public class Subsets2 {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        getAllSubsetsDup(nums, new ArrayList<>(), 0);
        Set<List<Integer>> dup = new HashSet<>(res);
        res.clear();
        res.addAll(dup);
        return res;
    }


    public void getAllSubsetsDup(int[] nums, List<Integer> tempList, int start){

        res.add(new ArrayList<>(tempList));
        for(int i=start; i<nums.length; i++){
//          if(i>start && nums[i] == nums[i-1]) continue;  This condition can also be used in place of Hashset. But hashset is intuitive
            tempList.add(nums[i]);
            getAllSubsetsDup(nums, tempList,i+1);
            tempList.remove(tempList.size()-1);
        }
    }
}
