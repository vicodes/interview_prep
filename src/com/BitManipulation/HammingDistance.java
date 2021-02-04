package com.BitManipulation;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/762/discuss/94698/Java-1-Line-Solution-:D
public class HammingDistance {

    public int hammingDistance(int x, int y){
        int d = 0;
        int bitxor = x ^ y;

        while (bitxor > 0){
            if (bitxor % 2 == 1){
                d++;
            }
            bitxor = bitxor >> 1;
        }

        return d;
    }

}
