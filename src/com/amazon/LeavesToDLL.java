package com.amazon;

//Question to convert leaf of binary tree to DLL and remove those leaf nodes as well
// and return head of DLL
public class LeavesToDLL {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = right =null;
        }
    }

    Node curr = new Node(-1);
    public Node convertToDLL(Node root){
        Node temp = curr;
        makeDLL(root);
        Node head = temp.right;
        head.left = null;
        return head;
    }
    public Node makeDLL(Node root)
    {
        if(root == null)
            return null;
        if(root.left == null  && root.right == null){
            Node next = new Node(root.data);
            curr.right = next;
            next.left = curr;
            curr = curr.right;
            return null;
        }
        root.left = makeDLL(root.left);
        root.right= makeDLL(root.right);
        return root;
    }


}
