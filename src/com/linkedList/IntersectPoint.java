package com.linkedList;

public class IntersectPoint {

    int intersectPoint(Node head1, Node head2)
    {
        // code here
        int c1 =0 ,c2=0;
        Node thead1 = head1;
        Node thead2 = head2;
        //Find length of first LL
        while(head1 != null){
            c1++;
            head1 = head1.next;
        }
        //Find length of second LL
        while(head2 != null){
            c2++;
            head2 = head2.next;
        }
        //Move head by difference whichever LL has greater Length
        int n = Math.abs(c1-c2);
        if(c1 > c2){
            while(n-- >0){
                thead1 = thead1.next;
            }
        }
        else if(c2>c1){
            while(n-- > 0){
                thead2 = thead2.next;
            }
        }
        //Return the intersection node
        while(thead1 != null && thead2  != null){
            if(thead1.next == thead2.next){
                return thead1.next.data;
            }
            thead1 = thead1.next;
            thead2 = thead2.next;
        }
        return -1;

    }

}
