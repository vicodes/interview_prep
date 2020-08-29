package com.StringQuestions;

// Question Link : https://leetcode.com/problems/maximum-score-after-splitting-a-string/discuss/597740/Java-StraightForward

public class MaximumScoreInString {

    public int maxScore(String s) {
        int n = s.length();
        int c1 = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') c1++;
        }
        int max = 0;
        int c2 = 0;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == '0') c2++;
            else c1--;
            max = Math.max(max, c1 + c2);
        }
        return max;
    }

}
