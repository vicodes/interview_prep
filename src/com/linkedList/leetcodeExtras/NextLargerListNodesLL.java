package com.linkedList.leetcodeExtras;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// https://leetcode.com/problems/next-greater-ListNode-in-linked-list/submissions/
public class NextLargerListNodesLL {

    public int[] nextLargerListNodes(ListNode head) {

        ListNode curr = head;
        int len = 0;

        List<Integer> arr = new ArrayList<>();


        while(curr != null) {
            arr.add(curr.val);
            curr = curr.next;
        }
        int n =  arr.size();
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];
        for(int i = n-1; i>=0; i--){

            while(!st.isEmpty() && arr.get(i)>=st.peek())
                st.pop();
            res[i] = st.isEmpty() ? 0 : st.peek();
            st.push(arr.get(i));
        }
        return res;

    }
    
}
