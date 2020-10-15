package com.StringQuestions;

// Question Link : https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/discuss/516973/JavaPython-3-Sliding-Window-O(n)-O(1)-code-w-explanation-and-analysis.
public class SubstringHavingabc {

    public int numberOfSubstrings(String s) {
        int[] count = new int[3];
        int ans = 0;
        for (int lo = -1, hi = 0; hi < s.length(); ++hi) {
            ++count[s.charAt(hi) - 'a'];
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                ans += s.length() - hi; // number of valid substrings all start from lo + 1, but end at hi, hi + 1, ..., s.length() - 1, respectively.
                --count[s.charAt(++lo) - 'a'];
            }
        }
        return ans;
    }

}
