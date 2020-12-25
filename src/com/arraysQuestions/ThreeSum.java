package com.arraysQuestions;
import java.util.*;

//https://leetcode.com/problems/3sum/discuss/143636/Java-with-set
public class ThreeSum {

    public  List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> res  = new HashSet<>(); // To remove duplicates

        if(nums.length==0) return new ArrayList<>(res);
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2;i++){
            int j =i+1;
            int  k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0)res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                else if ( sum >0) k--;
                else if (sum<0) j++;
            }

        }
        return new ArrayList<>(res);

    }

}
