package com.tree;

import java.util.Set;
import java.util.TreeSet;

public class NodesWithoutSiblings {

    Set<Integer> li = new TreeSet<>();

    void printSibling(Node node){
        printSiblingUtil(node);
        if(li.size()>0){
            for(Integer m : li){
                System.out.print(m + " ");
            }
        }
        else{
            System.out.print("-1");
        }
    }

    void printSiblingUtil(Node node)
    {
        if(node==null)
            return;
        if(node.left == null && node.right ==null){
            return;
        }
        if(node.left == null && node.right != null)
            li.add(node.right.data);
        else if(node.right == null && node.left != null)
            li.add(node.left.data);
        printSiblingUtil(node.left);
        printSiblingUtil(node.right);
    }

}
