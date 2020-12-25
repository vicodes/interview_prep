package com.tree.traversals;

import com.tree.Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//https://www.geeksforgeeks.org/reverse-level-order-traversal/

public class ReverseLevelOrder {

    void reverseLevelOrder(Node node)
    {
        Stack<Node> S = new Stack();
        Queue<Node> Q = new LinkedList();
        Q.add(node);

        // 1) Instead of printing a node, we push the node to stack
        // 2) Right subtree is visited before left subtree
        while (!Q.isEmpty())
        {
            /* Dequeue node and make it root */
            node = Q.poll();
            S.push(node);

            if (node.right != null)
                Q.add(node.right);

            if (node.left != null)
                Q.add(node.left);
        }


        while (S.empty() == false) {
            node = S.pop();
            System.out.print(node.data + " ");
        }
    }

}
