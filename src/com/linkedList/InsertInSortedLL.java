package com.linkedList;

public class InsertInSortedLL {

    Node sortedInsert(Node head1, int key) {
        Node mainHead = head1;
        Node prev =  head1;
        while(head1 != null){
            if(head1.data > key){
                Node node = new Node(key);
                if(prev != head1){
                    //To insert in middle
                    prev.next = node;
                    node.next = head1;
                    return mainHead;
                }else{
                    //To  insert in beginnning
                    node.next = head1;
                    return node;
                }
            }
            prev = head1;
            head1 = head1.next;
        }
        //To insert at last
        prev.next = new Node(key);
        return mainHead;
    }

}
