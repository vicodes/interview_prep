package com.arraysQuestions.Stack;

// Not on leetcode. Hence GFG
// https://www.geeksforgeeks.org/next-greater-element/

import java.util.Stack;

public class NextGreaterElement {

    public int[] nextGreaterElement(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];
        for(int  i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]>st.peek()){
                st.pop();
            }
            res[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        return res;
    }


}
