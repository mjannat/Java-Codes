package com.datastructure.stack;

import java.util.Stack;

public class StackBuildIn {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(4);
        stack.push(10);
        stack.push(30);

        System.out.println(stack.pop());

        System.out.println(stack.peek());

    }
}