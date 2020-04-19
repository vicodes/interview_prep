package com.linkedList;

/*Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.*/

public class AddNumbers {

    public Node addTwoNumbers(Node l1, Node l2) {
        Node c1 = l1;
        Node c2 = l2;
        Node sentinel = new Node(0);
        Node d = sentinel;
        int sum = 0;
        while (c1 != null || c2 != null) {
            sum /= 10;
            if (c1 != null) {
                sum += c1.data;
                c1 = c1.next;
            }
            if (c2 != null) {
                sum += c2.data;
                c2 = c2.next;
            }
            d.next = new Node(sum % 10);
            d = d.next;
        }
        if (sum / 10 == 1)
            d.next = new Node(1);
        return sentinel.next;
    }
}
