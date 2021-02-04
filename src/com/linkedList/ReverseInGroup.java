package com.linkedList;

//https://leetcode.com/problems/reverse-nodes-in-k-group/discuss/11440/Non-recursive-Java-solution-and-idea

import java.util.Stack;

public class ReverseInGroup {

    public Node reverseKGroup(Node head, int k) {
        if (head==null || head.next ==null || k==1 )
            return head;
        Node dummyhead = new Node(-1);
        dummyhead.next = head;
        Node begin = dummyhead;
        int i=0;
        while (head != null){
            i++;
            if (i%k == 0){
                begin = reverse(begin, head.next);
                head = begin.next;
            } else {
                head = head.next;
            }
        }
        return dummyhead.next;

    }

    public Node reverse(Node begin, Node end){
        Node prev = begin;
        Node curr = begin.next;
        Node first = curr;
        while (curr!=end){
            Node after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        begin.next = prev;
        first.next = curr;
        return first;
    }

    //-------Stack Based Approach------// uses O(k) space

    public static Node reverseInGroup(Node head, int k)
    {
        Stack<Node> st = new Stack<>();
        Node current = head;
        Node prev = null;

        while (current != null) {
            int count = 0;

            while (current != null && count < k) {
                st.push(current);
                current = current.next;
                count++;
            }
            while (!st.isEmpty()) {
                // If final list has not been started yet.
                if (prev == null) {
                    prev = st.pop();
                    head = prev;
                } else {
                    prev.next = st.pop();
                    prev = prev.next;
                }
            }
        }
        prev.next = null;
        return head;
    }

}
