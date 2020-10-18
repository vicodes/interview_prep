package com.arraysQuestions.kadaneAlgo;

// Question Link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
//  USING KADANE Alogorithm

public class StockBuySell {

    public int maxProfit(int[] prices) {

        int minTillNow = Integer.MAX_VALUE, max = 0;

        for (int cost: prices) {
            minTillNow = Math.min(minTillNow, cost);
            max = Math.max(max, cost - minTillNow);
        }
        return max;
    }
}
