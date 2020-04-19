package com.linkedList;

public class DeleteNodeWithoutHeadPointer {

// We cannot delete without head pointer so just copy next node value in node to be deleted
// and delete the next node (assumption it cannot be last node).

    public void deleteNode(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }

}
