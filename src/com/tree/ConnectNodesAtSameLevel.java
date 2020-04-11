package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectNodesAtSameLevel {

    class  Node{
        int data;
        Node left;
        Node right;
        Node  nextRight;
    }

    // Can be optimized with 2 additional pointers

/*    void connect(TreeLinkNode *root) {
        if (root == NULL) return;
        TreeLinkNode *pre = root;
        TreeLinkNode *cur = NULL;
        while(pre->left) {
            cur = pre;
            while(cur) {
                cur->left->next = cur->right;
                if(cur->next) cur->right->next = cur->next->left;
                cur = cur->next;
            }
            pre = pre->left;
        }
    }*/

    // MY  SOLUTION

    public static void connect(Node node)
    {
        Queue<Node> qu = new LinkedList<>();
        qu.add(node);

        while(!qu.isEmpty()){

            int n = qu.size();
            for(int i=0;i<n;i++){

                Node temp = qu.poll();
                if(n != 1 && i != n-1)
                    temp.nextRight = qu.peek();

                if(temp.left != null){
                    qu.add(temp.left);
                }

                if(temp.right != null){
                    qu.add(temp.right);
                }

            }
        }
    }

}
