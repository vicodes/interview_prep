package com.linkedList;

/*Input: [1,2,3,4,5]
Output: Node 3 from this list (next of middle in case of even) */
public class MiddleElementLL {

    /*Each time, slow go 1 steps while fast go 2 steps.
    When fast arrives at the end, slow will arrive right in the middle.*/

    public Node middleNode(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}