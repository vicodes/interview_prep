package com.SlidingWindow;

//https://leetcode.com/problems/max-consecutive-ones-iii/
public class MaxConsecutiveOnes3 {

    public int longestOnes(int[] A, int K) {

        int res = 0, left = 0, noOfZero = 0;

        for(int right = 0; right < A.length; right++){

            if(A[right] == 0)
                noOfZero++;

            while(noOfZero > K){
                if(A[left++] == 0){
                    noOfZero--;
                }
            }
            res = Math.max(res, right - left +1);
        }
        return res;
    }

}
