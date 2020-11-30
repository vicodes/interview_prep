package com.linkedList;
//https://leetcode.com/problems/add-two-numbers/submissions/
public class AddNumbers {

    public Node addTwoNumbers(Node l1, Node l2) {

        Node node = new Node(-1);
        Node head = node;
        int sum = 0;

        while (l1 != null || l2 != null) {

            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }
            node.next = new Node(sum % 10);
            node = node.next;
            sum /= 10;
        }

        if(sum != 0)
            node.next = new Node(sum);
        return head.next;
    }
}
