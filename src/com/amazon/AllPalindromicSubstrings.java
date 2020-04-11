package com.amazon;

import java.util.LinkedHashSet;
import java.util.Set;

public class AllPalindromicSubstrings {

    public static void getPalindromes(int s ,int e,String str,Set<String> set){
        while(s>=0 && e<str.length() && str.charAt(s)==str.charAt(e)){
            s--;
            e++;
            set.add(str.substring(s+1,e));
        }
    }

    public static void printPalind(String str){
        int n = str.length();
        Set<String> set = new LinkedHashSet<>();
        for(int i=0;i<n;i++) {
            getPalindromes(i, i, str,set);

            if (i + 1 < n && str.charAt(i) == str.charAt(i+1))
                getPalindromes(i, i + 1, str,set);
        }
        for(String s : set){
            System.out.println(s);
        }
    }


    public static void main(String[] args) {
        String str = "geeks";
        printPalind(str);
    }

}
