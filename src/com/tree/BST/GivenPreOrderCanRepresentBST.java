package com.tree.BST;
import java.util.Stack;
//Question Link : https://www.geeksforgeeks.org/check-if-a-given-array-can-represent-preorder-traversal-of-binary-search-tree/

//Done using idea that for every next greater element there should not be then a smaller
//element because we are on the right side of root and pre order traversal is Root,Left,Right

public class GivenPreOrderCanRepresentBST {

    boolean canRepresentBST(int pre[], int n) {
        Stack<Integer> s = new Stack<>();

        int root = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            // If we find a node who is on right side and smaller than root, return false
            if (pre[i] < root) {
                return false;
            }
            while (!s.empty() && s.peek() < pre[i]) {
                root = s.pop();
            }
            s.push(pre[i]);
        }
        return true;
    }

}
