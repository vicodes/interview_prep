package com.arraysQuestions;

import java.util.Stack;

// Question and Solution : https://leetcode.com/problems/minimum-cost-tree-from-leaf-values/discuss/339959/One-Pass-O(N)-Time-and-Space

public class MinCostTreeInArray {


    public int mctFromLeafValues(int[] A) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(Integer.MAX_VALUE);
        for (int a : A) {
            while (stack.peek() <= a) {
                int mid = stack.pop();
                res += mid * Math.min(stack.peek(), a);
            }
            stack.push(a);
        }
        while (stack.size() > 2) {
            res += stack.pop() * stack.peek();
        }
        return res;
    }

}
