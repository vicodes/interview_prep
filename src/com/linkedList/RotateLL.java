package com.linkedList;
/*Input: 1 2 3 4 5 6 7 8
Rotate by 4
Output: 5 6 7 8 1 2 3 4  */

public class RotateLL {

    public Node rotate(Node head, int k) {
        Node tail  = head;
        Node curr = head;
        int count = 0;
        int z = k;
        while(tail.next != null){
            tail = tail.next;
            count++;
            z--;
            if(z==1){
                curr = tail;
            }
        }
        if(k>count)
            return head;
        tail.next = head;
        head = curr.next;
        curr.next = null;
        return head;
    }

}
