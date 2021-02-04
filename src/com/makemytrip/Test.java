package com.makemytrip;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

public class Test {

    public static int change(int amount, int[] coins) {

        return coinChanges(coins, amount);
    }


    public static int coinChanges(int[] coins, int amount){

        if(amount == 0) return 1;
        int res  = 0;
        for(int c : coins){
            if(c <= amount){
                res += coinChanges(coins, amount-c);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 5};
        System.out.println(change(5,arr));

    }
}