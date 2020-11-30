package com.linkedList;

// https://leetcode.com/problems/reverse-linked-list/
class ReverseLL {

    public Node reverse(Node node)
    {
        if(node == null || node.next == null) return node;

        Node prev = null;
        Node current = node;
        while (current != null) {
            Node after = current.next;
            current.next = prev;
            prev = current;
            current = after;
        }
        return prev;
    }
}
