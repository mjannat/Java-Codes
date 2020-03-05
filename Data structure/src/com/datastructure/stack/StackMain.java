package com.datastructure.stack;

import java.util.Scanner;
import java.util.Stack;

public class StackMain {

    public static void main(String[] args) {
       StackImpl nums = new StackImpl();
       nums.push(15);
       nums.push(8);
       nums.push(10);
       
       
       
        System.out.println(nums.pop());
        
        System.out.println(nums.peek());
    }

}
