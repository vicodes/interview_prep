package com.linkedList;

import java.util.Stack;

public class BinaryTreeToDLL {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = right =null;
        }
    }
    // Take Inorder traversal  and convert to DLL  during the process
    Node bToDLL(Node root)
    {
        Node LHead = null;
        Node prev = null;
        Stack<Node> stack = new Stack<>();
        while(root!=null || !stack.empty()){
            while(root!=null){
                stack.add(root);
                root = root.left;
            }
            root = stack.pop();

            Node curr = new Node(root.data);
            if(prev != null){
                prev.right =  curr;
                curr.left = prev;
            }
            else{
                LHead =  curr;
            }
            prev = curr;

            root = root.right;
        }
        return LHead;
    }

}
