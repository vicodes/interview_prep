package com.tree;

import java.util.Stack;

// Check if two trees are same

public class CheckIdentical {
    boolean isIdentical(Node root1, Node root2)
    {

        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();

        while((root1 !=null && root2 !=null) || (!st1.isEmpty() ||
                !st2.isEmpty())){

            while(root1 !=null && root2!=null){
                st1.push(root1);
                st2.push(root2);
                root1 = root1.left;
                root2 = root2.left;
                if((root1 ==null && root2!=null) || (root1 !=null && root2==null))
                    return false;
            }
            root1 = st1.pop();
            root2 = st2.pop();
            if(root1.data != root2.data){
                return false;
            }
            root1 = root1.right;
            root2 = root2.right;
            if((root1 ==null && root2!=null) || (root1 !=null && root2==null))
                return false;
        }
        return true;
    }

}
