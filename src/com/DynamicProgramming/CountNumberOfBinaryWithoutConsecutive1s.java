package com.DynamicProgramming;

// Question Link :   http://www.geeksforgeeks.org/count-number-binary-strings-without-consecutive-1s/
public class CountNumberOfBinaryWithoutConsecutive1s {

    public static int countSimple(int n){
        int a = 1;
        int b = 1;

        for(int i=1; i < n; i++){
            int tmp = a;
            a = a + b;
            b = tmp;
        }

        return a + b;
    }

    public static void main(String args[]){
        System.out.println(countSimple(5));
    }
}