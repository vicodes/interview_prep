package com.adobe;
import java.util.Stack;

// Question Link : https://www.geeksforgeeks.org/given-an-array-arr-find-the-maximum-j-i-such-that-arrj-arri/
public class MaximumIndexInArray {

    public static void findMaxIndex(int[] arr){
        Stack<Integer> st = new Stack<>();
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            while (!st.isEmpty() || arr[st.peek()] > arr[i]){
                st.push(i);
            }
        }
        for(int i= arr.length-1;i>=0;i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                ans = Math.min(ans,st.peek()-i);
                st.pop();
            }
        }
        System.out.println(ans);
    }


    public static void main(String[] args) {
        int[] arr = new int[]{34,8,10,3,2,80,30,33,1};
        findMaxIndex(arr);
    }
}
