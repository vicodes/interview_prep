package com.linkedList;

public class RemoveDuplicatesInSorted {

    Node removeDuplicates(Node root)
    {
        Node head = root;
        Node curr = root;
        while(root != null && root.next != null){
            if(root.data !=root.next.data){
                curr.next = root.next;
                curr = root.next;
            }
            root = root.next;
            //This condition for last Node
            if(root.next == null){
                curr.next = null;
            }
        }
        return head;
    }

}
