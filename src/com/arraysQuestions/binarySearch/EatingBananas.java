package com.arraysQuestions.binarySearch;

//https://leetcode.com/problems/koko-eating-bananas/discuss/152506/Binary-Search-Java-Python-with-Explanations
public class EatingBananas {

    public int minEatingSpeed(int[] piles, int H) {
        int lo = 1, hi = getMaxPile(piles);

        // Binary search to find the smallest valid K.
        while (lo <= hi) {
            int mid = (lo + hi)/2;
            if (canEatAll(piles, mid, H)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return lo;
    }

    private boolean canEatAll(int[] piles, int mid, int H) {
        int countHour = 0; // Hours take to eat all bananas at speed K.

        for (int pile : piles) {
            countHour = countHour + pile / mid;
            if (pile % mid != 0)
                countHour++;
        }
        return countHour <= H;
    }

    private int getMaxPile(int[] piles) {
        int maxPile = Integer.MIN_VALUE;
        for (int pile : piles) {
            maxPile = Math.max(pile, maxPile);
        }
        return maxPile;
    }

}
