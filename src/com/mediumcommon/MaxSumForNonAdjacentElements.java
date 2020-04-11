package com.mediumcommon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxSumForNonAdjacentElements {

    public static void maxSum(int arr[]) {
        int excl = 0;
        int incl = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int temp = incl;
            incl = Math.max(excl + arr[i], incl);
            excl = temp;
        }
        System.out.println(incl);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
         int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            int[]  arr = new int[n];
            String starr[] = str.trim().split(" ");
            for (int j = 0;j<n;j++){
                arr[j] = Integer.parseInt(starr[j]);
            }
            maxSum(arr);
        }
    }
    
}
