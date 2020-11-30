package com.linkedList;

//https://leetcode.com/problems/merge-two-sorted-lists/

public class MergeTwoSortedLL {


    public Node mergeTwoLists(Node l1, Node l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        Node node = new Node(-1);
        Node head = node;

        while(l1 !=null && l2 != null){

            if(l1.data <= l2.data){
                node.next = new Node(l1.data);
                l1 = l1.next;
            }
            else{
                node.next = new Node(l2.data);
                l2 = l2.next;
            }
            node = node.next;
        }

        if(l1 != null) node.next  = l1;
        else if(l2 != null) node.next = l2;

        return head.next;
    }

}
