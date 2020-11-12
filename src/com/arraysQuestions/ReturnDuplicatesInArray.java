package com.arraysQuestions;
import java.util.ArrayList;
import java.util.List;

// Question : https://leetcode.com/problems/find-all-duplicates-in-an-array/

// Imp condition in array : 1 ≤ a[i] ≤ n (n = size of array),

public class ReturnDuplicatesInArray {

    // when find a number i, flip the number at position i-1 to negative.
    // if the number at position i-1 is already negative, i is the number that occurs twice.

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i])-1;
            if (nums[index] < 0)
                res.add(Math.abs(index+1));
            nums[index] = -nums[index];
        }
        return res;
    }

}
