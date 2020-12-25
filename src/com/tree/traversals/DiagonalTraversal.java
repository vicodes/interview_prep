package com.tree.traversals;

import com.tree.Node;

import java.util.LinkedList;
import java.util.Queue;
//https://www.techiedelight.com/print-diagonal-traversal-binary-tree/
public class DiagonalTraversal {

    public void diagonalTraversal(Node root){

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Node temp = new Node(-1); // identifier for every diagonal

        while(root != null)
            queue.add(root);
        queue.add(temp);

        while(queue.size() != 1){
            Node front = queue.poll();
            if(front != temp){
                System.out.println(front.data);
                Node node = front.left;
                while(node != null){
                    queue.add(node);
                    node = node.right;
                }
            }
            else{
                queue.add(temp);
                System.out.println();
            }
        }
    }
}
