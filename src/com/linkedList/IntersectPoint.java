package com.linkedList;

// https://leetcode.com/problems/intersection-of-two-linked-lists/
public class IntersectPoint {

    public Node intersectPoint(Node head1, Node head2) {

        if(head1 == null || head2 ==null) return null;
        // Find length of the lists
        int len1 = length(head1);
        int len2 = length(head2);

        //Move head by difference whichever LL has greater Length
        int n = Math.abs(len1-len2);

        if(len1 > len2)
            while(n-- >0){
                head1 = head1.next;
            }

        else if(len2 >len1){
            while(n-- > 0){
                head2 = head2.next;
            }
        }
        //Return the intersection node
        while(head1 != head2){
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1;

    }
    private int length(Node node) {
        int length = 0;
        while (node != null) {
            node = node.next;
            length++;
        }
        return length;
    }

}
