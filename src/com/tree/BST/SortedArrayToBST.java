package com.tree.BST;

import com.tree.TreeNode;

// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/submissions/
public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0)
            return null;

        return convertToTree(nums, 0, nums.length -1);
    }

    public TreeNode convertToTree(int[] nums, int low, int high){

        if(low > high)
            return null;

        int mid = (low+high)/2;
        TreeNode node =  new TreeNode(nums[mid]);
        node.left = convertToTree(nums,low, mid -1);
        node.right = convertToTree(nums, mid +1, high );
        return node;
    }

}
