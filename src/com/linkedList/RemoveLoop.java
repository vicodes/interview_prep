package com.linkedList;

import java.util.HashSet;

public class RemoveLoop {

    static boolean removeLoop(Node h)
    {
        HashSet<Node> s = new HashSet<Node>();
        Node prev = null;
        while (h != null) {
            if (s.contains(h)) {
                prev.next = null;
                return true;
            }
            else {
                s.add(h);
                prev = h;
                h = h.next;
            }
        }
        return false;
    }

}
