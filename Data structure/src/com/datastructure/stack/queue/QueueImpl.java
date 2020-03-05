package com.datastructure.stack.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImpl {

    public static void main(String[] args) {
        Queue<String> q1 = new LinkedList<String>();
        q1.add("Hello ");
        q1.add("Student ");
        q1.add("Exam ");
        q1.add("is knocking at the door");
        System.out.println("Element in queue" + q1);
        System.out.println("Remove Element " + q1.remove());
        System.out.println("Head : " + q1.element());
        System.out.println("Poll() " + q1.poll());
        System.out.println("Peek():" + q1.peek());
        System.out.println("Elements in Queue:" + q1);
    }

}
