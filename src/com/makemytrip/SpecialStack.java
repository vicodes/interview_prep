package com.makemytrip;

import java.util.Stack;


//Java implementation of SpecialStack
// Note : here we use Stack class for Stack implementation


/* A class that supports all the stack operations and one additional
operation getMin() that returns the minimum element from stack at
any time. This class inherits from the stack class and uses an
auxiliarry stack that holds minimum elements */

class SpecialStack extends Stack<Integer> {
    Stack<Integer> min = new Stack<>();

    /* SpecialStack's member method to insert an element to it. This method
    makes sure that the min stack is also updated with appropriate minimum
    values */
   /* SpecialStack's member method to insert an element to it. This method
makes sure that the min stack is also updated with appropriate minimum
values */

    void push(int x)
    {
        if(isEmpty() == true)
        {
            super.push(x);
            min.push(x);
        }
        else
        {
            super.push(x);
            int y = min.pop();
            min.push(y);

		/* push only when the incoming element of main stack is smaller
		than or equal to top of auxiliary stack */
            if( x <= y )
                min.push(x);
        }
    }

    /* SpecialStack's member method to remove an element from it. This method
    removes top element from min stack also. */
    public Integer pop()
    {
        int x = super.pop();
        int y = min.pop();

        /* Push the popped element y back only if it is not equal to x */
        if ( y != x )
            min.push(y);
        return x;
    }

// This code is contributed by Sumit Ghosh


    /* SpecialStack's member method to get minimum element from it. */
    int getMin() {
        int x = min.pop();
        min.push(x);
        return x;
    }

    /* Driver program to test SpecialStack methods */
    public static void main(String[] args) {
        SpecialStack s = new SpecialStack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.getMin());
        s.push(5);
        System.out.println(s.getMin());
    }
}

// Uses O(1) time and O(n) extra space
