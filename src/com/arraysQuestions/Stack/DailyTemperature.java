package com.arraysQuestions.Stack;

import java.util.Stack;

// https://leetcode.com/problems/daily-temperatures/
public class DailyTemperature {

    public int[] dailyTemperatures(int[] T) {
        int n = T.length;
        int[] wait = new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i = n-1; i>=0; i--){

            while(!st.isEmpty() && T[i]>=T[st.peek()]){
                st.pop();
            }
            wait[i] = st.isEmpty() ? 0 : st.peek()-i;
            st.push(i);
        }
        return wait;
    }

}
