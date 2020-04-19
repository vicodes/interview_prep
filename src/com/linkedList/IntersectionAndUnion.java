package com.linkedList;

import java.util.HashSet;
import java.util.TreeSet;

/*Input:9 6 4 2 3 8
      1 2 8 6
Output:2 6 8*/

public class IntersectionAndUnion {
// Only Intersection as of now.
    static Node findIntersection(Node head1, Node head2)
    {
        // add your code here
        Node node = new Node(0);
        Node head = node;
        HashSet<Integer> temp = new HashSet<>();
        TreeSet<Integer> tree = new TreeSet<>();
        boolean added = false;
        while(head1 != null){
            temp.add(head1.data);
            head1 = head1.next;
        }
        while(head2 !=null){
            if(temp.contains(head2.data)){
                tree.add(head2.data);
            }
            head2 = head2.next;
        }
        for(Integer i : tree){
            node.next = new Node(i);
            node = node.next;
        }
        return head.next;
    }

}
