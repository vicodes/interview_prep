package com.tree.traversals;

import com.tree.Node;
import java.util.*;
//https://leetcode.com/problems/binary-tree-level-order-traversal/submissions/
public class LevelOrderTraversalReturnElements {
    public List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;

        Queue<Node> qu = new LinkedList<>();
        qu.add(root);

        while(!qu.isEmpty()){

            int n = qu.size();
            List<Integer> subList= new ArrayList<>();
            for(int i=0; i<n; i++){
                Node temp = qu.poll();
                subList.add(temp.data);
                if(temp.left != null)
                    qu.add(temp.left);
                if(temp.right != null)
                    qu.add(temp.right);
            }
            res.add(subList);
        }
        return res;
    }
}
