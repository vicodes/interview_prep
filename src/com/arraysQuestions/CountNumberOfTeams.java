package com.arraysQuestions;

// Question and solution : https://leetcode.com/problems/count-number-of-teams/discuss/555441/JavaC%2B%2B-100-O(N2)-Easy-To-Understand-With-Explanation

public class CountNumberOfTeams {

    public int numTeams(int[] arr) {
        int count = 0;
        int len = arr.length;
        for (int j = 0; j < len; j++) {
            int leftSmaller = 0, rightLarger = 0;
            int leftLarger = 0, rightSmaller = 0;
            for (int i = 0; i < j; i++) {
                if (arr[i] < arr[j]) {
                    leftSmaller++;
                } else if (arr[i] > arr[j]) {
                    leftLarger++;
                }
            }
            for (int k = j + 1; k < len; k++) {
                if (arr[j] < arr[k]) {
                    rightLarger++;
                } else if (arr[j] > arr[k]) {
                    rightSmaller++;
                }
            }
            count += leftSmaller * rightLarger + leftLarger * rightSmaller;
        }

        return count;
    }

}
