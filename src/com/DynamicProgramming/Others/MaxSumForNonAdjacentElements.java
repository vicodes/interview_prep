package com.DynamicProgramming.Others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Solution Link : https://github.com/mission-peace/interview/blob/master/src/com/interview/dynamic/MaxSumForNonAdjacentElements.java

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

}
