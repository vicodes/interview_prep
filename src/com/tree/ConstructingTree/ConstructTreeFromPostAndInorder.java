package com.tree.ConstructingTree;
import com.tree.Node;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class ConstructTreeFromPostAndInorder {

    static int index;

    public static Node constructTree(int start, int end, int[] postorder, Map<Integer, Integer> map){

        if(start > end)
            return null;

        Node root = new Node(postorder[index--]);
        int mapIndex = map.get(root.data);
        root.right = constructTree(mapIndex+1, end, postorder, map);
        root.left = constructTree(start, mapIndex-1, postorder, map);
        return root;
    }

    public static void main(String[] args) {
        int[] inorder = {4, 8, 2, 5, 1, 6, 3, 7};
        int[] postorder = {8, 4, 5, 2, 6, 7, 3, 1};

        index = postorder.length-1;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length; i++)
            map.put(inorder[i], i);

        Node root = constructTree(0, inorder.length-1, postorder, map);
        // Can check by printing inorder/preorder traversal from above root value
    }

    
}

