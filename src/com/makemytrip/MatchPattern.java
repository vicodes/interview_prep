package com.makemytrip;


import java.util.HashMap;

class MatchPattern {

    // Function to encode given string
    static String encodeString(String str)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        String res = "";
        int i = 0;

        char ch;
        for (int j = 0; j < str.length(); j++) {
            ch = str.charAt(j);

            if (!map.containsKey(ch))
                map.put(ch, i++);

            res += map.get(ch);
        }

        return res;
    }

    static void findMatchedWords(String[] dict, String pattern)
    {
        int len = pattern.length();

        String hash = encodeString(pattern);

        // for each word in the dictionary array
        for (String word : dict) {
            if (word.length() == len && encodeString(word).equals(hash))
                System.out.print(word + " ");
        }
    }

    // Driver code
    public static void main(String args[])
    {
        String[] dict = { "abb", "abc", "xyz", "xyy" };
        String pattern = "foo";

        findMatchedWords(dict, pattern);
    }

    // This code is contributed
    // by rachana soma
}