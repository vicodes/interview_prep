package com.makemytrip;

//Given a string ‘str’, check if it can be constructed by taking a substring of it and appending multiple copies
//        of the substring together.  For example "abab" can be created by appending "ab" to "ab", but "abac" cannot
//        be created by appending a substring to itself.

import java.lang.*;
import java.io.*;

class StringFromSubstring {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String str  =  br.readLine();
            checkrepeat(str);
        }

    }

    public static void checkrepeat(String str){
        String sttr = str +  str;
        sttr  = sttr.substring(1,sttr.length()-1);
        System.out.println(sttr.indexOf(str)!=-1);
    }
}
