package com.hardcommon;

/*Input  : List = 2->3->7->3->2->12->24
Output : 5
The longest palindrome list is 2->3->7->3->2*/

public class LongestPalindromeInLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    // function for counting the common elements
    static int countCommon(Node a, Node b)
    {
        int count = 0;

        // loop to count coomon in the list starting
        // from node a and b
        for (; a != null && b != null;
             a = a.next, b = b.next)

            // increment the count for same values
            if (a.data == b.data)
                ++count;
            else
                break;

        return count;
    }

    // Returns length of the longest palindrome
// sublist in given list
    static int maxPalindrome(Node head)
    {
        int result = 0;
        Node prev = null, curr = head;

        // loop till the end of the linked list
        while (curr != null)
        {
            // The sublist from head to current
            // reversed.
            Node next = curr.next;
            curr.next = prev;

            // check for odd length
            // palindrome by finding
            // longest common list elements
            // beginning from prev and
            // from next (We exclude curr)
            result = Math.max(result,
                    2 * countCommon(prev, next)+1);

            // check for even length palindrome
            // by finding longest common list elements
            // beginning from curr and from next
            result = Math.max(result,
                    2*countCommon(curr, next));

            // update prev and curr for next iteration
            prev = curr;
            curr = next;
        }
        return result;
    }

}
