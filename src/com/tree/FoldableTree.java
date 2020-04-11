package com.tree;

//Asked only in Expedia
public class FoldableTree {

    boolean IsFoldable(Node node)
    {
        if (node == null)
            return true;

        return IsFoldableUtil(node.left, node.right);
    }

    /* A utility function that checks if trees with roots as n1 and n2
     are mirror of each other */
    boolean IsFoldableUtil(Node n1, Node n2)
    {

        /* If both left and right subtrees are NULL,
         then return true */
        if (n1 == null && n2 == null)
            return true;

        /* If one of the trees is NULL and other is not,
         then return false */
        if (n1 == null || n2 == null)
            return false;

        /* Otherwise check if left and right subtrees are mirrors of
         their counterparts */
        return IsFoldableUtil(n1.left, n2.right)
                && IsFoldableUtil(n1.right, n2.left);
    }

}
