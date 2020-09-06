package com.StringQuestions;

import java.util.Stack;

// Question Link and Solution : https://leetcode.com/problems/valid-parentheses/discuss/9178/Short-java-solution

public class ValidParanthesis {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        String st = "";
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

}
