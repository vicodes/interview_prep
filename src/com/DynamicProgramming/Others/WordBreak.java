package com.DynamicProgramming.Others;

import java.util.ArrayList;
import java.util.Set;

// Question Link : https://leetcode.com/problems/word-break/
// Best solution and explanation : https://www.ideserve.co.in/learn/word-break-problem
public class WordBreak {


    public static boolean hasValidWords(String words, ArrayList<String> dictionary) {

        // Empty string
        if(words == null || words.length() == 0) {
            return true;
        }

        int n = words.length();
        boolean[] validWords = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (dictionary.contains(words.substring(0, i + 1))) {
                validWords[i] = true;
            }
            if (validWords[i] == true && (i == n - 1))
                return true;
            if (validWords[i] == true) {
                for (int j = i + 1; j < n; j++) {
                    if (dictionary.contains(words.substring(i + 1, j + 1))) {
                        validWords[j] = true;
                    }
                    if (j == n - 1 && validWords[j] == true) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
