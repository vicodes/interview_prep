package com.linkedList;

import java.util.HashSet;

public class DetectLoop {

    Node head;

    //Using two pointers - Fastest method

    int detectLoop() {
        Node slow_p = head, fast_p = head;
        while (slow_p != null && fast_p != null && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                System.out.println("Found loop");
                return 1;
            }
        }
        return 0;
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
