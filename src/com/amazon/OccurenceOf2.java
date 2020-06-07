package com.amazon;

import com.sun.xml.internal.ws.util.StringUtils;

public class OccurenceOf2 {

    public static int countNumberOftwo(long n){
        long z = 1;
        String pattern = "";
        while(z <= n){
            pattern = pattern.concat(String.valueOf(z++));
        }
        int count = pattern.length() - pattern.replaceAll("2","").length();
        return count;
    }

    public static void main(String[] args) {
        long n = 100;
        System.out.println(countNumberOftwo(n));
    }
}
