package com.arraysQuestions;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


/*Given an array of DISTINCT elements, rearrange the elements of array in zig-zag fashion in O(n) time.
        The converted array should be in form a < b > c < d > e < f. (Smaller-greater alternate)
        Example:

        Input: arr[] = {4, 3, 7, 8, 6, 2, 1}
        Output: arr[] = {3, 7, 4, 8, 2, 6, 1}


        Input: arr[] = {1, 4, 3, 2}
        Output: arr[] = {1, 4, 2, 3}*/


class ZigzagArray {
    public static void main(String[] args) throws IOException {
        //code
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];
            String str = br.readLine();
            String star[] = str.trim().split(" ");
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(star[j]);
            }
            zigZag(arr);
        }
    }

    public static void zigZag( int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if (i % 2 == 0) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i);
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    swap(arr, i);
                }
            }
        }
/*        for (int p = 0; p < arr.length; p++) {
            System.out.print(arr[p] +  " ");
        }*/
        System.out.println(Arrays.toString(arr).replaceAll("[\\[|\\]|\\,]", "") + " ");
        System.out.println();
    }

    public static void swap ( int[] arr, int a){
        int temp = arr[a];
        arr[a] = arr[a + 1];
        arr[a + 1] = temp;
    }
}
