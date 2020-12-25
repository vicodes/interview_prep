package com.StringQuestions;

// Question and solution : https://leetcode.com/problems/longest-palindromic-substring/discuss/2928/Very-simple-clean-java-solution

// Idea is to expand around every substring in the given String. Consider eg. babab. Extend around b(index=0) and check if its left and right parts
// equal. Since none are there continue. Now take ba considering even length palindromic substring. they themselves not equal hence continue.
// Take 'a' (index=1), it is equal to itself, then expand around it both sides until an un-equal character is found. Record lo and maxLen to return
// answer as substring later.

public class LongestPalindromicSubstring {

    private int lo, maxLen;

    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2)
            return s;

        for (int i = 0; i < len-1; i++) {
            extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
            extendPalindrome(s, i, i+1); //assume even length.
        }
        return s.substring(lo, lo + maxLen);
    }

    private void extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if (maxLen < k - j - 1) {
            lo = j + 1;
            maxLen = k - j - 1;
        }
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring ll = new LongestPalindromicSubstring();
        ll.longestPalindrome("babad");
    }
}

