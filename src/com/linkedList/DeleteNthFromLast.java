package com.linkedList;

//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class DeleteNthFromLast {

    // Other approach can be by calculating size of linkedlist
    // APPROACH Here - Move fast in front so that the gap between slow and fast becomes n
    public Node removeNthFromEnd(Node head, int n) {

        Node start = new Node(0);
        Node slow = start, fast = start;
        slow.next = head;

        for(int i=1; i<=n+1; i++)   {
            fast = fast.next;
        }
        //Move fast to the end, maintaining the gap
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        //Skip the desired node
        slow.next = slow.next.next;
        return start.next;
    }

}
