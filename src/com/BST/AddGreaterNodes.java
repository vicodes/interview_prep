package com.BST;

//To convert bst into which every node has sum of all  smaller nodes
public class AddGreaterNodes {

    int sum = 0;

    public Node convertBST(Node root) {
        convert(root);
        return root;
    }

    public void convert(Node cur) {
        if (cur == null) return;
        convert(cur.right);
        cur.data += sum;
        sum = cur.data;
        convert(cur.left);
    }

}


