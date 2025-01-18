package org.interview.common.code;

import java.util.Stack;

public class balanceBracket {

    public static boolean isParenthesesBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (ch == ')' && top != '(') {
                    return false;
                } else if (ch == ']' && top != '[') {
                    return false;
                } else if (ch == '}' && top != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input1 = "{()}[]";
        String input2 = "{[]())}";
        if (isParenthesesBalanced(input1)) {
            System.out.println(input1 + " Balanced");
        } else {
            System.out.println(input1 + " Not Balanced");
        }
        if (isParenthesesBalanced(input2)) {
            System.out.println(input2 + " Balanced");
        } else {
            System.out.println(input2 + " Not Balanced");
        }
    }
}