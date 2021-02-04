package com.tree;

// https://leetcode.com/problems/symmetric-tree/submissions/

public class AreMirror {

    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return checkSymmetric(root.left, root.right);

    }

    private boolean checkSymmetric(TreeNode node1, TreeNode node2){
        if(node1 == null &&  node2 == null)
            return true;
        if(node1 == null || node2 == null || node1.val != node2.val)
            return false;

        return checkSymmetric(node1.left, node2.right) && checkSymmetric(node1.right,node2.left);
    }
}
