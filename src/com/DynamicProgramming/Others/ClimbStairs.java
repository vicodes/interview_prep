package com.DynamicProgramming.Others;

// Question Link : https://leetcode.com/problems/climbing-stairs/
//Watch tushar roy explanation if not able to understand
// This is most optimised approach. A normal dp  approach can also be done.
public class ClimbStairs {

    public int climbStairs(int n) {
        // base cases
        if(n <= 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;

        int one_step_before = 2;
        int two_steps_before = 1;
        int all_ways = 0;

        for(int i=2; i<n; i++){
            all_ways = one_step_before + two_steps_before;
            two_steps_before = one_step_before;
            one_step_before = all_ways;
        }
        return all_ways;
    }

}
