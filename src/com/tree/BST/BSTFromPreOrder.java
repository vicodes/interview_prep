package com.tree.BST;

public class BSTFromPreOrder {

    int i = 0;
    public Node bstFromPreorder(int[] A) {
        return bstFromPreorder(A, Integer.MAX_VALUE);
    }

    public Node bstFromPreorder(int[] A, int bound) {
        if (i == A.length || A[i] > bound) return null;
        Node root = new Node(A[i++]);
        root.left = bstFromPreorder(A, root.data);
        root.right = bstFromPreorder(A, bound);
        return root;
    }

    public  static void main(String args[]){
        int[] arr = new int[]{10,5,1,7,40,50};
        BSTFromPreOrder bst = new BSTFromPreOrder();
        Node ans = bst.bstFromPreorder(arr);
    }
    
}
