package com.BST;

public class KthSmallestInBST {

    private static int number = 0;
    private static int count = 0;

    public int kthSmallest(Node root, int k) {
        count = k;
        helper(root);
        return number;
    }

    public void helper(Node n) {
        if (n.left != null) helper(n.left);
        count--;
        if (count == 0) {
            number = n.data;
            return;
        }
        if (n.right != null) helper(n.right);
    }
    
}
