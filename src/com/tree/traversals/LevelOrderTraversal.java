package com.tree.traversals;

import com.tree.Node;

import java.util.LinkedList;
import java.util.Queue;

//https://www.geeksforgeeks.org/level-order-tree-traversal/

public class LevelOrderTraversal {

    void printLevelOrder(Node root) {

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            if (tempNode.left != null)
                queue.add(tempNode.left);

            if (tempNode.right != null)
                queue.add(tempNode.right);
        }
    }

}
