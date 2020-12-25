package com.tree.ConstructingTree;

import com.tree.Node;

import java.util.HashMap;
import java.util.Map;

public class ConstructFromPreAndInorder {

    static int index = 0;
    public static Node constructTree(int start, int end, int[] preOrder, Map<Integer, Integer> map){

        if(start > end)
            return null;

        Node root = new Node(preOrder[index++]);
        int mapIndex = map.get(root.data);
        root.left = constructTree(start, mapIndex-1,preOrder,map);
        root.right = constructTree(mapIndex+1, end, preOrder, map);
        return root;
    }

    public static void main(String[] args) {
        int[] inorder = { 4, 2, 1, 7, 5, 8, 3, 6 };
        int[] preorder = { 1, 2, 4, 3, 5, 7, 8, 6 };

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length; i++)
            map.put(inorder[i], i);

        Node root = constructTree(0, inorder.length-1, preorder, map);
        // Can check by printing inorder/preorder traversal from above root value
    }
}


