package com.arraysQuestions;

public class SortZeroOneTwo {

 // Single traversal approach to partition into three parts using pivot.
    // (https://www.techiedelight.com/sort-array-containing-0s-1s-2s-dutch-national-flag-problem/)
    public static void threeWayPartition(int[] A, int end)
    {
        int start = 0, mid = 0;
        int pivot = 1;

        while (mid <= end)
        {
            if (A[mid] < pivot)		 // current element is 0
            {
                swap(A, start, mid);
                ++start;
                ++mid;
            }
            else if (A[mid] > pivot)	// current element is 2
            {
                swap(A, mid, end);
                --end;
            }
            else						// current element is 1
                ++mid;
        }
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }


    // Counting sort technique Used. 2 traversals
    public static int[] sortMe(int[] arr) {
        int c1 = 0, c2 = 0, c3 = 0;
        for (int z = 0; z < arr.length; z++) {
            if (arr[z] == 0) c1++;
            if (arr[z] == 1) c2++;
            if (arr[z] == 2) c3++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (c1 != 0) {
                arr[i] = 0;
                c1--;
            } else if (c2 != 0) {
                arr[i] = 1;
                c2--;
            } else if (c3 != 0) {
                arr[i] = 2;
                c3--;
            }
        }
        return arr;
    }
}
