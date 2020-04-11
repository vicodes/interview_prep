package com.tree;

public class SumTree {

    // MIGHT NOT WORK

    boolean isSumTree(Node node)
    {
        // Your code here
        //   Answer obj = new Answer();
        int ans = 0;
        return solve(node, ans)>1?true:false;
    }

    int solve(Node node, int ans){
        if(node == null)    return 0;
        if(node.left ==null && node.right == null) return node.data;

        int left = solve(node.left,ans);
        int right = solve(node.right,ans);
        if(left + right != node.data)
            ans = 0;
        return left + right + node.data;
    }

}
