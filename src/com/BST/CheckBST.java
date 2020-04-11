package com.BST;

import com.BST.Node;

import javax.swing.tree.TreeNode;
import java.util.Stack;


public class CheckBST {

    public boolean isValidBST(Node root) {
        if (root == null) return true;
        Stack<Node> stack = new Stack<>();
        Node pre = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if(pre != null && root.data <= pre.data) return false;
            pre = root;
            root = root.right;
        }
        return true;
    }
}
