package com.StringQuestions.slidingWindow;

import java.util.*;

//Leetcode Question : https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/discuss/648559/JavaPython-3-Slide-Window-O(n)-codes.

public class MaximumVowelsinSubstring {

    public int maxVowels(String s, int k) {
        int ans = 0;
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for (int i = 0, winCnt = 0; i < s.length(); ++i) {
            if (vowels.contains(s.charAt(i))) {
                ++winCnt;
            }
            if (i >= k && vowels.contains(s.charAt(i - k))) {
                --winCnt;
            }
            ans = Math.max(winCnt, ans);
        }
        return ans;
    }

}
