package com.linkedList;

import java.util.HashSet;

public class RemoveLoop {

    static boolean removeLoop(Node head)
    {
        HashSet<Node> s = new HashSet<Node>();
        Node prev = null;
        while (head != null) {
            if (s.contains(head)) {
                prev.next = null;
                return true;
            }
            else {
                s.add(head);
                prev = head;
                head = head.next;
            }
        }
        return false;
    }

}
