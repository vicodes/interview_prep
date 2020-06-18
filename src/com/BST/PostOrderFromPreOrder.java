package com.BST;

//To find postorder from  preorder traversal.Challenge to do without constructing bst.
// Question Link : https://www.geeksforgeeks.org/find-postorder-traversal-of-bst-from-preorder-traversal/

// Didn't understand recursive function

public class PostOrderFromPreOrder {
    
    int index = 0;

    static void findPostOrderUtil(int pre[], int n, int minval,
                                  int maxval, int index)
    {

        // If entire preorder array is traversed then  
        // return as no more element is left to be  
        // added to post order array.  
        if (index == n)
            return;

        // If array element does not lie in range specified,  
        // then it is not part of current subtree.  
        if (pre[index] < minval || pre[index] > maxval) {
            return;
        }

        // Store current value, to be printed later, after  
        // printing left and right subtrees. Increment  
        // index to find left and right subtrees,  
        // and pass this updated value to recursive calls.  
        int val = pre[index];
        index++;

        // All elements with value between minval and val  
        // lie in left subtree.  
        findPostOrderUtil(pre, n, minval, val, index);

        // All elements with value between val and maxval  
        // lie in right subtree.  
        findPostOrderUtil(pre, n, val, maxval, index);

        System.out.print( val + " ");
    }

}
