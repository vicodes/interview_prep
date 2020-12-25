package com.makemytrip;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

public class Test {

    public  static void rotate(int[] nums, int k) {

        int  n = nums.length;
        int numToRotate = nums[0];
        int curr = 0, start = 0, temp = 0;

        for(int j=0 ; j<n; j++){
            temp = nums[(curr +k) %n];
            nums[(curr +k) %n] = numToRotate;
            numToRotate = temp;
            curr = (curr + k) % n;
            if(curr == start && ++curr < n){
                numToRotate = nums[++curr];
                start++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-1,-100,3,99};
        rotate(arr,2);

    }
}