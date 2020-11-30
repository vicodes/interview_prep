package com.linkedList;

// https://leetcode.com/problems/swap-nodes-in-pairs/submissions/

public class PairWiseSwap {
    public Node swapPairs(Node head) {

        if(head == null || head.next == null) return head;

        Node prev = null;
        Node curr = head;
        Node after = head.next;
        head = head.next;

        while(curr !=null && after != null){
            curr.next = after.next;
            after.next = curr;
            if(prev != null) prev.next  = after;
            prev = curr;
            curr = curr.next;
            if(curr != null)after = curr.next;
        }
        return head;
    }
}
