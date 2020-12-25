package com.SlidingWindow;
import java.util.*;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, res = 0;
        Set<Character> set = new HashSet<>();

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                res = Math.max(res, set.size());
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return res;
    }
}
