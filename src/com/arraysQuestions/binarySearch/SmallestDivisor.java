package com.arraysQuestions.binarySearch;

//https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
public class SmallestDivisor {

    public static int smallestDivisor(int[] nums, int threshold) {

        int low = 1;
        int high = Integer.MIN_VALUE;

        for(int a : nums)
            high = Math.max(high, a);

        while(low < high){
            int mid = (low + high)/2;
            int sum = getRemainder(nums, mid);
            if(sum <= threshold){
                high = mid;
            }
            else
                low = mid +1;
        }
        return low;
    }

    public static int getRemainder(int[] nums, int mid){
        int rem = 0;
        for(int a :  nums)
            rem += (int) Math.ceil((double)a/mid);
        return rem;
    }

}
