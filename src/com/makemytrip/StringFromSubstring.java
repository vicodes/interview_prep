package com.makemytrip;

//Question Link : https://leetcode.com/problems/repeated-substring-pattern/discuss/94344/Simple-Java-solution-2-lines#

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
        System.out.println(sttr.contains(str));
    }
}
