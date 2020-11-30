package com.arraysQuestions;

// https://leetcode.com/problems/majority-element/
// Actual Algo used : https://www.cs.utexas.edu/~moore/best-ideas/mjrty/example.html
public class MajorityElement {

    public int majorityElement(int[] num) {

        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;

        }
        return major;
    }

}
