package com.arraysQuestions;

// Question and Solution : https://leetcode.com/problems/merge-sorted-array/discuss/29522/This-is-my-AC-code-may-help-you
// Just dry run, simple to understand.
// array A has extra space for adding B array elements.

class MergeTwoSortedArrays
{
    public void merge(int A[], int m, int B[], int n) {

        for(int i = m + n - 1; i>=0; i--) {

            if( m>0 && n>0) {
                if(B[n-1] > A[m-1]) {
                    A[i] = B[n-1];
                    n--;
                }
                else {
                    A[i] = A[m-1];
                    m--;
                }
            }
            else if(m>0) {
                A[i] = A[m-1];
                m--;
            }
            else if(n>0) {
                A[i] = B[n-1];
                n--;
            }
        }

    }

}
