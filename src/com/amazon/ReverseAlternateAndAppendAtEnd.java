package com.amazon;

public class ReverseAlternateAndAppendAtEnd {

    void rearrange(Node odd) {

        // If linked list has less than 3 nodes, no change is required
        if (odd == null || odd.next == null || odd.next.next == null) {
            return;
        }

        // even points to the beginning of even list
        Node even = odd.next;

        // Remove the first even node
        odd.next = odd.next.next;

        // odd points to next node in odd list
        odd = odd.next;

        // Set terminator for even list
        even.next = null;

        // Traverse the  list
        while (odd != null && odd.next != null) {

            // Store the next node in odd list
            Node temp = odd.next.next;

            // Link the next even node at the beginning of even list
            odd.next.next = even;
            even = odd.next;

            // Remove the even node from middle
            odd.next = temp;

            // Move odd to the next odd node
            if (temp != null) {
                odd = temp;
            }
        }

        // Append the even list at the end of odd list
        odd.next = even;
    }

}
