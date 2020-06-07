package com.amazon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// Input - DDIDDIID
// Output - 321654798
public class PatternofDI {

    public static void main (String[] args)  throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String data = br.readLine();
            List<Integer> li = new ArrayList<>();
            findIndexOfI(data,li);
            findPattern(data,li);
        }
    }

    public static void findIndexOfI(String str, List<Integer> li){
        for(int i =0; i<str.length();i++){
            if(str.charAt(i) == 'I'){
                li.add(i);
            }
        }
    }

    public static void findPattern(String str , List<Integer> li){
        String pattern = "";
        int max = 1,count = 0,z=0;

        if(li.size()==0){
            int n = str.length();
            pattern = pattern.concat(String.valueOf(n+1));
            for(int i =0; i<str.length();i++){
                pattern = pattern.concat(String.valueOf(n--));
            }
        }
        else{
            max = max + li.get(0);
            pattern = pattern.concat(String.valueOf(max));
            z = max;
            for(int i = 0; i<str.length(); i++){
                if(str.charAt(i) == 'D'){
                    pattern = pattern.concat(String.valueOf(--z));
                }
                else{
                    count++;
                    if(count > li.size()-1)
                        max = max + (str.length()-i);
                    else
                        max = max + (li.get(count) - li.get(count-1));
                    pattern = pattern.concat(String.valueOf(max));
                    z = max;
                }
            }
        }
        System.out.println(pattern);
    }

}
