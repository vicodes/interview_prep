package com.linkedList;

// Given 1->2->3->4, reorder it to 1->4->2->3. (Hard Problem)
// https://leetcode.com/problems/reorder-list/


import java.util.Stack;

public class ReorderLL {
    // 1. My own solution. Using stack to pick one Node from list and
    // one from stack and interchange.
    public void reorderListMine(Node head) {
        if(head == null) return;

        Node curr = head;

        Stack<Node> st = new Stack<>();
        int len = 0;
        while(curr != null){
            st.push(curr);
            len++;
            curr = curr.next;
        }
        Node after = null ;
        for(int i=0; i<len-1; i++){

            if(i%2 == 0){
                after = head.next;
                head.next = st.pop();
            }
            else
                head.next = after;
            head = head.next;
        }
        head.next = null;
    }


   // 2.Copied Solution from leetcode with better space complexity.
    public void reorderList(Node head) {
        if(head==null||head.next==null) return;

        //Find the middle of the list
        Node p1=head;
        Node p2=head;
        while(p2.next!=null&&p2.next.next!=null){
            p1=p1.next;
            p2=p2.next.next;
        }

        //Reverse the half after middle  1->2->3->4->5->6 to 1->2->3->6->5->4
        Node preMiddle=p1;
        Node preCurrent=p1.next;
        while(preCurrent.next!=null){
            Node current=preCurrent.next;
            preCurrent.next=current.next;
            current.next=preMiddle.next;
            preMiddle.next=current;
        }

        //Start reorder one by one  1->2->3->6->5->4 to 1->6->2->5->3->4
        p1=head;
        p2=preMiddle.next;
        while(p1!=preMiddle){
            preMiddle.next=p2.next;
            p2.next=p1.next;
            p1.next=p2;
            p1=p2.next;
            p2=preMiddle.next;
        }
    }
    
}
