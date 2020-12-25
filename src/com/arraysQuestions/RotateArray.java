package com.arraysQuestions;

//https://leetcode.com/problems/rotate-array/
public class RotateArray {

    public void rotate(int[] nums, int k) {

        int  n = nums.length;
        int numToRotate = nums[0];
        int curr = 0, start = 0, temp;

        for(int j=0 ; j<n; j++){
            temp = nums[(curr +k) %n];
            nums[(curr +k) %n] = numToRotate;
            numToRotate = temp;
            curr = (curr + k) % n;
            // This is to check if it comes back to same element which is already rotated
            // then move to next element.
            if(curr == start && curr + 1 < n){
                numToRotate = nums[++curr];
                start++;
            }
        }
    }

}
