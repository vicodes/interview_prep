package com.easyCommon;

//Given an array A of size N containing 0s, 1s, and 2s; you need to sort the array in ascending order.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortZeroOneTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] strs = line.trim().split("\\s+");
            int[] arr = new int[n];
            for(int j=0; j<arr.length;j++){
                arr[j] = Integer.parseInt(strs[j]);
            }
            sortMe(arr);
        }
    }

    public static void sortMe(int[] arr){
        int c1=0,c2=0,c3=0;
        for(int z=0; z<arr.length;z++){
            if(arr[z]==0)
                c1++;
            if(arr[z]==1)
                c2++;
            if(arr[z]==2)
                c3++;
        }

        for(int i=0; i<arr.length;i++){
            if(c1!=0){
                arr[i]=0;
                c1--;
            }
           else if(c2!=0){
                arr[i]=1;
                c2--;
            }
           else if(c3!=0){
                arr[i]=2;
                c3--;
            }
        }
     /*   for(int m=0; m<arr.length;m++){
            System.out.print(arr[m] + " ");
        }*/
     // Printing array took 0.22s whereas stringbuffer took  0.2
        StringBuffer sb = new StringBuffer(Arrays.toString(arr).replace("[","").replace(",","").replace("]",""));
        System.out.println(sb);
    }

}
