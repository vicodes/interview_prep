package com.linkedList;

/*Input: 1 2 2 4 5 6 7 8
  Output:2 1 4 2 6 5 8 7 */

public class PairWiseSwap {

    public Node pairwiseSwap(Node node) {
        Node curr = node;
        Node after = node.next;
        int temp = 0;
        while(curr != null && after != null){
            temp = curr.data;
            curr.data = after.data;
            after.data = temp;
            curr = after.next;
            if(curr != null)
                after = curr.next;
        }
        return node;
    }
}
