package com.arraysQuestions;

import java.util.PriorityQueue;
import java.util.Queue;

// Find 3rd max element in array in O(n) time complexity
// Question Link :
public class ThirdMax {

    public int thirdMax(int[] nums) {

        Queue<Integer> que = new PriorityQueue<>();

        for(int n : nums){
            if(!que.contains(n)) que.add(n);

            if(que.size() > 3) que.remove();
        }
        if(que.size() >= 3 || que.size() == 1) return que.peek();

            //when we only have two items n the que.
        else {
            que.remove();
            return que.peek();
        }
    }

    // TO find second max. Approach can be used for third max also.
    // To use two variables to keep track.

    public static void findSecondLargest(int arr[], int arr_size)
    {
        int i, first, second;

        /* There should be atleast two elements */
        if (arr_size < 2) {
            System.out.print(" Invalid Input ");
            return;
        }

        first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr_size; i++) {
            /* If current element is greater than
            first then update both first and second */
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }

            /* If arr[i] is in between first and
               second then update second  */
            else if (arr[i] > second && arr[i] != first)
                second = arr[i];
        }

        if (second == Integer.MIN_VALUE)
            System.out.print("There is no second largest" + " element\n");
        else
            System.out.print("The second largest element" + " is " + second);
    }

}


