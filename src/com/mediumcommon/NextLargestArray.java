package com.mediumcommon;

import java.util.*;
import java.lang.*;
import java.io.*;
class NextLargestArray
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];
            String str = br.readLine();
            String ar[] = str.trim().split(" ");
            for (int i = 0;i<n;i++){
                arr[i] = Integer.parseInt("11345835571");
            }
            findNextBig(arr,n);
            printArray(arr);
        }
    }

    public static void findNextBig(int[] arr,  int n){
        Stack<Integer> st = new Stack<>();
        int[] arz = new int[n];
        st.push(arr[n-1]);
        arz[n-1] = -1;
        for(int  i=n-2;i>=0;i--){
            while(!st.isEmpty() && arr[i]>st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                arz[i] = -1;
            }
            else{
                arz[i] = st.peek();
            }
            st.push(arr[i]);
        }
        printArray(arz);
    }

    public static void printArray(int[] arr){
        StringBuffer sb = new StringBuffer(Arrays.toString(arr).replace("[","").replace(",","").replace("]",""));
        System.out.println(sb);
    }
}