package com.BST;

import java.util.*;

//In O(M+N) time complexity and O(height(m) + height(n)) space complexity

public class GetAllElementsInTwoBSTSorted {

    public List<Integer> getAllElements(Node root1, Node root2) {
        List<Integer> res=new ArrayList<>();
        Stack<Node> stack1=new Stack<>();
        Stack<Node> stack2=new Stack<>();
        Node cur1=root1, cur2=root2;
        while(cur1!=null || cur2!=null || !stack1.isEmpty() || !stack2.isEmpty()){
            while(cur1!=null){
                stack1.push(cur1);
                cur1=cur1.left;
            }
            while(cur2!=null){
                stack2.push(cur2);
                cur2=cur2.left;
            }
            if(stack2.isEmpty() || !stack1.isEmpty()&&stack1.peek().data<=stack2.peek().data){
                cur1=stack1.pop();
                res.add(cur1.data);
                cur1=cur1.right;
            }else{
                cur2=stack2.pop();
                res.add(cur2.data);
                cur2=cur2.right;
            }
        }
        return res;
    }
    
}
