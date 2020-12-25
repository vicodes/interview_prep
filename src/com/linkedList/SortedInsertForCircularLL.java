package com.linkedList;

/*Input : 2->4->7->9->2 (Circular)
Insert 5
Output : 2->4->5->7->9->2 */


public class SortedInsertForCircularLL {

    public static void insert(Node zhead, int value, int n)
    {
        Node temp = zhead;
        int flag = 0;
        int  k = n;
        Node curr = new Node(value);
        // For case where first node is greater than value
        if(temp.data > value){
            curr.next = temp;
            while(--n > 0){
                temp = temp.next;
            }
            temp.next = curr;
            zhead = curr;
        }
        else{
            // Inserting anywhere in between
            while(--n > 0){
                if(temp.next.data > value){
                    curr.next = temp.next;
                    temp.next = curr;
                    flag  = 1;
                    break;
                }
                temp = temp.next;
            }
            // For case where last node is still less  than value so  insert at last
            if(flag == 0){
                temp.next.next = curr;
                curr.next = zhead;
            }
        }
        //print the linked list
        while(k-- >= 0){
            System.out.print(zhead.data + " ");
            zhead = zhead.next;
        }
    }

}
