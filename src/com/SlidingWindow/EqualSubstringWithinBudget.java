package com.SlidingWindow;

//https://leetcode.com/problems/get-equal-substrings-within-budget/
public class EqualSubstringWithinBudget {

    public int equalSubstring(String s, String t, int maxCost) {
        int right=0,left=0,cost=0,len=0;

        while(right<s.length()){
            cost+=Math.abs(s.charAt(right)-t.charAt(right));
            right++;

            while(cost>maxCost) {
                cost-=Math.abs(s.charAt(left)-t.charAt(left));
                left++;
            }
            len=Math.max(len,right-left);
        }
        return len;
    }
    
}
