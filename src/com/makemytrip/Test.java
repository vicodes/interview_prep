package com.makemytrip;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Test {

    public static int numOfSubarrays(int[] arr) {
        int odd = 0, even = 1, res = 0, sum = 0, mod = 1_000_000_007; // treat empty subarray as even
        for (int n : arr) {
            sum += n;
            if (sum % 2 == 0) {
                even++;
                res = (res + odd) % mod;
            } else {
                odd++;
                res = (res + even) % mod;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(numOfSubarrays(new int[]{2,4,9}));
    }
}