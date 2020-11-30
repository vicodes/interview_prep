package com.linkedList.leetcodeExtras;


// https://leetcode.com/problems/odd-even-linked-list/discuss/78079/Simple-O(N)-time-O(1)-space-Java-solution.
public class OddEvenLL {

    public ListNode oddEvenList(ListNode head) {
        if (head != null) {

            ListNode odd = head, even = head.next, evenHead = even;

            while (even != null && even.next != null) {
                odd.next = odd.next.next;
                even.next = even.next.next;
                odd = odd.next;
                even = even.next;
            }
            odd.next = evenHead;
        }
        return head;
    }

}
