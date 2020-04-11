package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LeftView {

    void leftView(Node root)
    {
        if (root == null)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty())
        {
            int n = queue.size();
            for (int i = 1; i <= n; i++) {
                Node temp = queue.poll();

                if (i == 1)
                    System.out.print(temp.data + " ");
                if (temp.left != null)
                    queue.add(temp.left);
                if (temp.right != null)
                    queue.add(temp.right);
            }
        }
    }

}
