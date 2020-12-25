package com.linkedList;

import java.util.HashSet;
// https://leetcode.com/problems/linked-list-cycle/submissions/
public class CycleinLL {

    Node head;

    //Using two pointers - Fastest method

   public Boolean detectLoop() {
        if(head == null) return false;

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow)
                return true;
        }
        return false;
    }

    //Using hashing

    static boolean detectLoop(Node h)
    {
        HashSet<Node> s = new HashSet<Node>();
        while (h != null) {

            if (s.contains(h))
                return true;
            s.add(h);
            h = h.next;
        }
        return false;
    }
}
