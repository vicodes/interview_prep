package com.linkedList;

import java.util.HashMap;
import java.util.Map;

//Clone basically means to copy  LL
public class CloneWithNextAndRandom {
    static class RandomListNode{
        int data;
        RandomListNode next;
        RandomListNode random;
        RandomListNode(int data){
            this.data = data;
            next = random =null;
        }
    }

    // O(N) Auxiliary space  soln  used for HashMap
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) return null;

        Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();

        // loop 1. copy all the nodes
        RandomListNode node = head;
        while (node != null) {
            map.put(node, new RandomListNode(node.data));
            node = node.next;
        }

        // loop 2. assign next and random pointers
        node = head;
        while (node != null) {
            map.get(node).next = map.get(node.next);
            map.get(node).random = map.get(node.random);
            node = node.next;
        }

        return map.get(head);
    }

    // O(1) Auxiliary space solution (Understand from GFG- tricky to get it in head)

    public RandomListNode copyRandomListOptimised(RandomListNode head) {
        RandomListNode iter = head, temp;

        // First round: make copy of each node,
        // and link them together side-by-side in a single list.
        while (iter != null) {
            temp = iter.next;

            RandomListNode copy = new RandomListNode(iter.data);
            iter.next = copy;
            copy.next = temp;

            iter = temp;
        }

        // Second round: assign random pointers for the copy nodes.
        iter = head;
        while (iter != null) {
            if (iter.random != null) {
                iter.next.random = iter.random.next;
            }
            iter = iter.next.next;
        }

        // Third round: restore the original list, and extract the copy list.
        iter = head;
        RandomListNode pseudoHead = new RandomListNode(0);
        RandomListNode copy, copyIter = pseudoHead;

        while (iter != null) {
            temp = iter.next.next;

            // extract the copy
            copy = iter.next;
            copyIter.next = copy;
            copyIter = copy;

            // restore the original list
            iter.next = temp;

            iter = temp;
        }

        return pseudoHead.next;
    }
}
