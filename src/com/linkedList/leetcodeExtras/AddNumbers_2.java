package com.linkedList.leetcodeExtras;

import java.util.Stack;

// https://leetcode.com/problems/add-two-numbers-ii/submissions/

public class AddNumbers_2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();
        ListNode ListNode = new ListNode(-1);
        ListNode newHead = ListNode;

        while(l1 != null){
            st1.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            st2.push(l2.val);
            l2 = l2.next;
        }
        int sum = 0;
        while(!st1.isEmpty() || !st2.isEmpty()){
            if(!st1.isEmpty()) sum += st1.pop();
            if(!st2.isEmpty()) sum += st2.pop();

            int value = sum%10;
            st3.push(value);
            sum = sum/10;
        }
        if(sum>0)st3.push(sum);

        while(!st3.isEmpty()){
            ListNode.next = new ListNode(st3.pop());
            ListNode = ListNode.next;
        }

        return newHead.next;
    }
    
}
