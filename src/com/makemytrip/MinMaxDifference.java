package com.makemytrip;
import java.lang.*;
import java.io.*;
// Question Link : https://www.geeksforgeeks.org/maximum-difference-between-two-elements/
/*
Input : arr = {2, 3, 10, 6, 4, 8, 1}
        Output : 8
        Explanation : The maximum difference is between 10 and 2.
*/
//Solved  using  kadane  algorithm
//        1.  Find  min  element found  till  now
//        2.  Find difference  from the min element found  till  now  from every element hence getting max  difference


class MinMaxDifference{
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];
            int maxDiff = Integer.MIN_VALUE;
            String str = br.readLine();
            String ar[] = str.trim().split(" ");
            for (int i = 0;i<n;i++){
                    arr[i] = Integer.parseInt(ar[i]);
            }
            int minTillNow = arr[0];
            for (int i = 1;i<n;i++){
                maxDiff = Math.max(maxDiff, arr[i] - minTillNow);
                minTillNow = Math.min(minTillNow, arr[i]);
            }
            System.out.println(maxDiff);
        }
        br.close();
    }
}