package com.arraysQuestions;

import java.util.PriorityQueue;

// Question Link : https://practice.geeksforgeeks.org/problems/minimum-cost-of-ropes/0

public class MinimumCostOfRopes {

    public static void calculateRopeLength(int[] arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<arr.length;i++){
            pq.offer(arr[i]);
        }

        long result = 0;
        while(!pq.isEmpty() && pq.size()>1){
            int a = pq.poll();
            int b = pq.poll();
            int sum = a + b;
            pq.offer(sum);
            result = result + (long)sum;
        }
        System.out.println(result);
    }

}
