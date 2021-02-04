package com.SlidingWindow;

//https://leetcode.com/problems/longest-turbulent-subarray/
public class TurbulentSubArray {

    public int maxTurbulenceSize(int[] arr) {

        int res = 1;
        int lFlag = -1, gFlag = -1;
        int left = 0, right = 0;

        for(; right<arr.length-1; right++){

            if(arr[right] < arr[right+1] && (lFlag == -1 || lFlag == 1)){
                lFlag = 0; gFlag = 1;
                res = Math.max(res, right-left+1);
            }
            else if(arr[right] > arr[right+1] && (gFlag == -1 || gFlag == 1)){
                lFlag = 1; gFlag = 0;
                res = Math.max(res, right-left+1);
            }
            else{
                res = Math.max(res, right-left+1);
                if(arr[right] == arr[right+1])
                    left =right +1;
                else
                    left = right;
            }

        }
        return Math.max(res, right-left+1);
    }

}
