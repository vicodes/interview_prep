package com.tree.PathSum;

import com.tree.Node;

//https://leetcode.com/problems/path-sum/
public class RootToLeafPathSum {


    public boolean hasPathSum(Node root, int sum) {
        if(root == null) return false;

        if(root.left == null && root.right == null && sum - root.data == 0) return true;

        return hasPathSum(root.left, sum - root.data) || hasPathSum(root.right, sum - root.data);
    }


}
