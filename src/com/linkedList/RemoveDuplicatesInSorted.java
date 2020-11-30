package com.linkedList;

// https://leetcode.com/problems/remove-duplicates-from-sorted-list/submissions/
public class RemoveDuplicatesInSorted {

    public Node deleteDuplicates(Node head) {

        if(head == null || head.next == null) return head;

        Node node1 = head;
        Node node2 =  head.next;

        while(node2 != null){

            if(node1.data == node2.data)
                node1.next = node2.next;

            else
                node1 = node1.next;

            node2 = node2.next;
        }
        return head;
    }

}
