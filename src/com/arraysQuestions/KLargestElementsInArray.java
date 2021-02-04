package com.arraysQuestions;
import java.util.*;

// https://practice.geeksforgeeks.org/problems/k-largest-elements3736/1#
public class KLargestElementsInArray {

    public static ArrayList<Integer> kLargest(int arr[], int n, int k) {

        ArrayList<Integer> res = new ArrayList<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int a : arr)
            maxHeap.offer(a);

        while(k-- > 0)
            res.add(maxHeap.poll());

        return res;
    }
   // Time complexity is O(n + klogn)
}
