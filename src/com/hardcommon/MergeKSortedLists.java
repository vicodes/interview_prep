package com.hardcommon;

import java.util.Comparator;
import java.util.PriorityQueue;

/*Input: [1->4->5, 1->3->4, 2->6]
Output: 1->1->2->3->4->4->5->6 */
//Did it myself

public class MergeKSortedLists {

    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }
        ListNode head = new ListNode(-1);
        ListNode lNode  = head;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length,new Comparator<ListNode>(){
            public int compare(ListNode listNode1,ListNode listNode2){
                return listNode1.val-listNode2.val;
            }
        });
        for(int i=0;i<lists.length;i++){
            if(lists[i] != null )
                pq.add(lists[i]);
        }

        while(!pq.isEmpty()){
            ListNode curr = pq.poll();
            lNode.next = curr;
            lNode = lNode.next;
            if(curr.next != null){
                pq.add(curr.next);
            }
        }

        return head.next;
    }
}
