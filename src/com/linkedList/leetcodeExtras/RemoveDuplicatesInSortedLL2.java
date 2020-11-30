package com.linkedList.leetcodeExtras;
//  https://leetcode.com/problems/remove-duplicates-from-sorted-list/submissions/
public class RemoveDuplicatesInSortedLL2 {

    public ListNode deleteDuplicates(ListNode head) {

        if(head == null) return null;

        ListNode curr = head;
        ListNode prev = null;
        int flag = 0;

        while(curr != null){

            flag = 0;

            while(curr != null && curr.next != null && curr.val == curr.next.val){
                flag = 1;
                curr = curr.next;
            }
            if(flag == 0) prev = curr;

            if(prev == null) head = curr.next;

            else prev.next = curr.next;

            curr = curr.next;
        }
        return head;
    }

}
