package com.tree;

import java.util.Stack;

//https://www.geeksforgeeks.org/write-c-code-to-determine-if-two-trees-are-identical/

public class CheckIdentical {

    boolean isIdentical(Node a, Node b) {

        if(a == null && b == null)
            return true;

        if(a ==null || b == null)
            return false;

        if(a.data != b.data)
            return false;

        return isIdentical(a.left,b.left) && isIdentical(a.right,b.right);
    }

}
