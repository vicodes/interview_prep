package com.amazon;
import java.util.ArrayList;

public class BinaryTreeFromLL {

    static class Tree{
        int data;
        Tree left;
        Tree right;
        Tree(int d){
            data=d;
            left=null;
            right=null;
        }
    }

    public static Tree convert(Node head, Tree node) {

        ArrayList<Tree> li = new ArrayList<>();
        while(head != null){
            Tree temp = new Tree(head.data);
            li.add(temp);
            head = head.next;
        }
        int n = li.size();
        for(int i=0;i<n/2;i++){
            if(2*i+1<n){
                li.get(i).left =  li.get(2*i+1);
            }
            if(2*i+2<n){
                li.get(i).right =  li.get(2*i+2);
            }
        }
        return li.get(0);
    }



}
