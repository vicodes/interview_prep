package com.linkedList;

/*Input: 1->2->4, 1->3->4
  Output: 1->1->2->3->4->4*/

public class MergeTwoSorted {


    public Node mergeTwoLists(Node l1, Node l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.data < l2.data){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

}
