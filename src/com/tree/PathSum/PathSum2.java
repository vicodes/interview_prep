package com.tree.PathSum;
import com.tree.Node;
import java.util.*;

// https://leetcode.com/problems/path-sum-ii/discuss/36698/Another-accepted-Java-solution
public class PathSum2 {

    public List<List<Integer>> pathSum(Node root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        pathSum(root, sum, res, path);
        return res;
    }

    public void pathSum(Node root, int sum, List<List<Integer>> res, List<Integer> path){
        if(root==null) return;
        path.add(root.data);

        if(root.left==null && root.right==null && sum == root.data){
            res.add(new ArrayList<Integer>(path));
        }
        else{
            pathSum(root.left, sum - root.data, res, path);
            pathSum(root.right, sum - root.data, res, path);
        }
        path.remove(path.size()-1);
    }
    
}
