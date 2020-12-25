package com.DynamicProgramming.LongestCommon;

// https://www.geeksforgeeks.org/minimum-number-deletions-make-string-palindrome/
// https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/


public class MinDeletionOrInsertiontoMakeStringPalindrome {

    public int lps(String str){

        LongestPalidromicSubsequence lps = new LongestPalidromicSubsequence();
        int lpsLength = lps.longestPalindromeSubseq(str);
        return str.length() - lpsLength;
    }

}
