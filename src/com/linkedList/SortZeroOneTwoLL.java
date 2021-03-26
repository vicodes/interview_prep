package com.linkedList;

// Actually Changing postition of nodes.
public class SortZeroOneTwoLL {

    public static Node sortList(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        // Create three dummy nodes to point to
        // beginning of three linked lists. These
        // dummy nodes are created to avoid many
        // null checks.
        Node zeroD = new Node(0);
        Node oneD = new Node(0);
        Node twoD = new Node(0);

        // Initialize current pointers for three
        // lists and whole list.
        Node zero = zeroD, one = oneD, two = twoD;
        // Traverse list
        Node curr = head;
        while (curr!=null)
        {
            if (curr.data == 0)
            {
                zero.next = curr;
                zero = zero.next;
            }
            else if (curr.data == 1)
            {
                one.next = curr;
                one = one.next;
            }
            else
            {
                two.next = curr;
                two = two.next;
            }
            curr = curr.next;

        }
        // Attach three lists
        zero.next = (oneD.next!=null) ? (oneD.next) : (twoD.next);
        one.next = twoD.next;
        two.next = null;
        // Updated head
        head = zeroD.next;
        return head;
    }

}
