package com.easyCommon;

import java.util.Stack;

class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    /* The method insert to push element
       into the queue */
    void insert(int B)
    {
        s1.push(B);
    }

    /* The method remove which return the
      element popped out of the queue*/
    int remove()
    {
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int z = -1;
        if(!s2.isEmpty())
            z = s2.pop();

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return z;
    }
}