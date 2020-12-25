package com.linkedList;

//https://leetcode.com/problems/reverse-nodes-in-k-group/discuss/11440/Non-recursive-Java-solution-and-idea

public class ReverseInGroup {

    public Node reverseKGroup(Node head, int k) {
        Node begin;
        if (head==null || head.next ==null || k==1)
            return head;
        Node dummyhead = new Node(-1);
        dummyhead.next = head;
        begin = dummyhead;
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
        Node curr = begin.next;
        Node first = curr;
        Node prev = begin;
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

}
