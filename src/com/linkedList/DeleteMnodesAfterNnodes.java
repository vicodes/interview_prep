package com.linkedList;

/*Input: M = 2, N = 2
Linked List: 1->2->3->4->5->6->7->8
Output:
Linked List: 1->2->5->6 */


public class DeleteMnodesAfterNnodes {

    static void linkdelete(Node head, int M, int N)
    {
        Node curr  = head;
        Node after = null;
        int m = M;
        int n = N;
        while(curr != null){
            while(--m > 0 && curr!=null){
                curr = curr.next;
            }
            after = curr;
            while(n-- > 0  && after != null){
                after = after.next;
            }
            if(after != null){
                curr.next = after.next;
                curr = curr.next;
                m = M;
                n = N;
            }
            else if(curr != null){
                curr.next = null;
            }
        }
    }
}
