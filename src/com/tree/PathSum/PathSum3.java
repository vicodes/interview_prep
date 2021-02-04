package com.tree.PathSum;

import com.tree.Node;

public class PathSum3 {

    public int pathSum(Node root, int sum) {
        if (root == null) return 0;
        return calculateSum(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int calculateSum(Node node, int sum) {
        if (node == null) return 0;
        return (node.data == sum ? 1 : 0)
                + calculateSum(node.left, sum - node.data) + calculateSum(node.right, sum - node.data);
    }
    
}
