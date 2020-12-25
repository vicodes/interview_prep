package com.DynamicProgramming.MCM;
//https://leetcode.com/problems/super-egg-drop/submissions/
// Seft written. Inpired by Aditya Verma YT and leetcode.
// Used binary search to pass leetcode.
class EggDroping {

    int[][] dp;
    public int superEggDrop(int e, int f) {

        dp = new int[e+1][f+1];
        return getAttempts(e,f);
    }

    private int getAttempts(int e, int f){

        if(f==0 || f==1 || e == 1) return f;

        if(dp[e][f] != 0) return dp[e][f];

        int low = 1, high = f, res = f;

        while(low < high){

            int mid = low + (high - low)/2;
            int left = getAttempts(e-1, mid -1);
            int right = getAttempts(e, f-mid );

            int temp = 1 + Math.max(left, right);

            res = Math.min(res, temp);

            if (left == right) {
                break;
            } else if (left < right) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        dp[e][f] = res;
        return res;
    }
}


