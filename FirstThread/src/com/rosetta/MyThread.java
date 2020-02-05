package com.rosetta;


public class MyThread extends Thread {

    public int id;

    public MyThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread Class Object " + id);
        } catch (Exception e) {
        }
    }
}
