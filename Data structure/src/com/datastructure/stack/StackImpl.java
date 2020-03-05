package com.datastructure.stack;

import java.util.Scanner;
import java.util.Stack;

public class StackImpl {

    int stack[] = new int[5];
    int top = 0;
    public void push(int data)
    {
    stack[top] = data;
    top++;
    }
    public int pop()
    {
        int data;
        data = stack[top-1];
        stack[top] = 0;
        top--;
        return data;
    }
     public int peek()
    {
        int data;
        data = stack[top-1];
        return data;
    }
    public void show()
    {
    for(int n : stack)
    {
        System.out.println(n + " ");
    }
    }
}
