package com.Miscellaneous;

import java.util.Collections;
import java.util.PriorityQueue;

// https://leetcode.com/problems/find-median-from-data-stream/discuss/74047/JavaPython-two-heap-solution-O(log-n)-add-O(1)-find
//Watch youtube video if not able to understand later

public class MedianInStream {

    //Normal priority queue returns smallest element. Adding Collections.reverseOrder() returns max element
    private PriorityQueue<Integer> small = new PriorityQueue<>(Collections.reverseOrder());
    private PriorityQueue<Integer> large = new PriorityQueue<>();
    private boolean even = true;

    public double findMedian() {
        if (even)
            return (small.peek() + large.peek()) / 2.0;
        else
            return small.peek();
    }

    public void addNum(int num) {
        if (even) {
            large.offer(num);
            small.offer(large.poll());
        } else {
            small.offer(num);
            large.offer(small.poll());
        }
        even = !even;
    }
}
