package com.tree.BST;

import com.tree.TreeNode;

//https://leetcode.com/problems/kth-smallest-element-in-a-bst/submissions/
public class KthSmallestInBST {

    int count = 0, res = 0;
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root, k);
        return res;
    }

    private void inOrder(TreeNode root, int k){
        if(root == null) return;
        inOrder(root.left, k);
        count++;
        if(count == k)
            res = root.val;
        inOrder(root.right, k);
    }
    
}
