package com.BST;

// Question Link : https://practice.geeksforgeeks.org/problems/find-the-closest-element-in-bst/1

public class ClosestElementInBST {

    static int minVal;

    static int maxDiff(Node  root, int k)
    {
        minVal = Math.abs(root.data - k);
        findDiff(root,k);
        return minVal;
    }
    static void findDiff(Node root, int k){
        if(root == null)
            return;
        minVal = Math.min(minVal,Math.abs(root.data - k));
        if(root.data < k)
            findDiff(root.right,k);
        else
            findDiff(root.left,k);
    }

}
