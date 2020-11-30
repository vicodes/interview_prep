package com.DynamicProgramming.LongestCommon;

public class LongestCommonSubstring {

    public static int longestCommonSubstring(String str1, String str2, int s1, int s2){

        int dp[][] = new int[s1+1][s2+1];
        int result = 0;

        for(int i = 0; i <= s1; i++){
            for(int j = 0; j<= s2; j++){
                if(i == 0 || j == 0)
                    dp[i][j] = 0;
                else if(str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    result = Math.max(result, dp[i][j]);
                }
                else
                    dp[i][j] = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "abcdxyz";
        String s2 = "xyzabcd";
        System.out.println(longestCommonSubstring(s1,s2, s1.length(),s2.length()));
    }
}
