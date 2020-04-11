package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class KDistanceFromRoot {

    void printKdistance(Node root, int k)
    {
        if(root == null) return;
        if(k == 0) System.out.print(root.data);
        else{
            Queue<Node> qu = new LinkedList<>();
            qu.add(root);
            k=k+1;
            while(!qu.isEmpty()){
                int n = qu.size();
                k--;

                for(int i=0;i<n;i++){
                    root = qu.poll();
                    if(k==0)
                        System.out.print(root.data + " ");
                    if(root.left != null)
                        qu.add(root.left);
                    if(root.right != null)
                        qu.add(root.right);
                }
            }
        }
    }
}
