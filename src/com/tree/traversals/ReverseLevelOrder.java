package com.tree.traversals;

import com.tree.Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//https://www.geeksforgeeks.org/reverse-level-order-traversal/

public class ReverseLevelOrder {

    void reverseLevelOrder(Node node)
    {
        Stack<Node> st = new Stack();
        Queue<Node> qu = new LinkedList();
        qu.add(node);


        while (!qu.isEmpty()) {
            node = qu.poll();
            st.push(node);

            if (node.right != null)
                qu.add(node.right);

            if (node.left != null)
                qu.add(node.left);
        }


        while (!st.empty()) {
            System.out.print(st.pop().data + " ");
        }
    }

}
