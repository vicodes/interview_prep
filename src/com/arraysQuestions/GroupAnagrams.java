package com.arraysQuestions;
import java.util.*;

//https://leetcode.com/problems/group-anagrams/discuss/19176/Share-my-short-JAVA-solution

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = new char[26];
            for (char c : s.toCharArray()) ca[c - 'a']++;
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        GroupAnagrams  ss = new GroupAnagrams();
        ss.groupAnagrams(new String[]{"eat","ate","tell"});
    }

}
