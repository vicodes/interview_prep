package com.StringQuestions;

public class ValidAnagrams {

    public boolean isAnagram(String s, String t) {

        int[] temp = new int[26];

        for(int i=0; i<s.length(); i++)
            temp[s.charAt(i) - 'a']++;

        for(int j=0; j<t.length(); j++)
            temp[t.charAt(j) - 'a']--;

        for(int k = 0; k < 26; k++){
            if(temp[k] != 0)
                return false;
        }
        return true;
    }

}
