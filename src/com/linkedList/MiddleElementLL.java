package com.linkedList;

// https://leetcode.com/problems/middle-of-the-linked-list/

public class MiddleElementLL {

    public Node middleNode(Node head) {

        if(head == null || head.next == null) return head;

        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}