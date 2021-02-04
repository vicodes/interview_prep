package com.tree;

//https://leetcode.com/problems/balanced-binary-tree/discuss/35686/Java-solution-based-on-height-check-left-and-right-node-in-every-recursion-to-avoid-further-useless-search
class CheckTreeBalanced {

    Node root;

    int height (Node root) {
        if (root == null) return 0;

        int leftHeight = height (root.left);
        if (leftHeight == -1) return -1;
        int rightHeight = height (root.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1)  return -1;
        return Math.max(leftHeight, rightHeight) + 1;
    }

    boolean isBalanced(Node root) {
        return height(root) != -1;
    }
}
