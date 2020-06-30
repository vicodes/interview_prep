package com.DynamicProgramming;

// Question Link : https://leetcode.com/problems/shortest-common-supersequence/
public class ShortestCommonSuperSequence {

    public String shortestCommonSupersequence(String str1, String str2) {
        //Part1 fill the longest common sequence table
        int[][] dp = new int[str1.length()+1][str2.length()+1];
        for(int i = 0;i<str1.length();i++){
            for(int j = 0;j<str2.length();j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    dp[i+1][j+1] = dp[i][j] + 1;
                }else {
                    dp[i+1][j+1] = Math.max(dp[i][j+1],dp[i+1][j]);
                }
            }
        }
        //Part2: use the table to get the ans
        StringBuilder sb = new StringBuilder();
        for(int i = str1.length()-1,j = str2.length()-1;i>=0 || j>=0;){
            //Case 1: either there is no char in str1 or str2, append char directly
            if(i < 0){
                sb.append(str2.charAt(j));
                j--;
                continue;
            }else if(j < 0){
                sb.append(str1.charAt(i));
                i--;
                continue;
            }
            //Case 2: if the value is the same compared with left or uppper cell, append corresponding char in str1 or str2
            // in longest common sequence, this means the char should be deleted, but in this problem, we need to append
            int val = dp[i+1][j+1];
            if(val == dp[i][j+1]){
                sb.append(str1.charAt(i));
                i--;
            }else if(val == dp[i+1][j]){
                sb.append(str2.charAt(j));
                j--;
                //Case 3 if the value is not the same compared with left or upper cell, append char and i--,j--
                //in longest common sequence, this means we find the common char
            }else {
                sb.append(str1.charAt(i));
                i--;
                j--;
            }
        }
        return sb.reverse().toString();
    }
}
