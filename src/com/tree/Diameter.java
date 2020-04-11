package com.tree;

public class Diameter {

    int max=0;

    int diameter(Node node){
        maxDepth(node);
        return max+1;
    }


    int maxDepth(Node node)
    {
        if(node == null) return 0;

        int lh = maxDepth(node.left);
        int rh = maxDepth(node.right);

        max = Math.max(max, lh + rh);

        return 1 + Math.max(lh,rh);
    }
}
