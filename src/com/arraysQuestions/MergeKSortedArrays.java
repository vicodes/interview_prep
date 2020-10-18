package com.arraysQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;


public class MergeKSortedArrays {

    private MinHeapNode root;

    static class MinHeapNode implements Comparable<MinHeapNode> {
        int element;
        int currArr;
        int nextEleOfCurrArr; //to check if array elements are finished

        MinHeapNode(int ele, int i, int j) {
            this.element = ele;
            this.currArr = i;
            this.nextEleOfCurrArr = j;
        }

        @Override
        public int compareTo(MinHeapNode minheapnode) {
            return this.element - minheapnode.element;
        }
    }


    public static Object[] mergeKArrrays(int arr[][], int k) {
        List<Integer> output = new ArrayList<>();
        PriorityQueue<MinHeapNode> pq = new PriorityQueue<>(    );

        // intialise a pq of size k elements from each of the k arrays
        for (int i = 0; i < k; i++) {
            pq.add(new MinHeapNode(arr[i][0], i, 1));

        }

        // pop from the pq and add next element from the popped element's array
        while (!pq.isEmpty()) {
            MinHeapNode root = pq.poll();
            output.add(root.element);

            if (root.nextEleOfCurrArr < arr[root.currArr].length) {
                root.element = arr[root.currArr][root.nextEleOfCurrArr];
                root.nextEleOfCurrArr += 1;
                pq.add(root);

            }
        }

        return output.toArray();
    }

    public static void main(String args[]) {
        int[][] arr = {{2, 6, 12, 34, 35}, {1, 9, 20, 1000}, {23, 34, 90, 2000}};

        int n = 4, k = 3;
        Object[] output = mergeKArrrays(arr, k);
        for (int i = 0; i < n * k; i++) {
            System.out.print(output[i] + " ");
        }

    }

}
