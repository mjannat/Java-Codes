package com.rosetta;


public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++)
        {
            MyThread ob = new MyThread(i);
            ob.setPriority(Thread.MIN_PRIORITY);
            ob.start();
            Thread ob2 = new Thread(new MyThreadInterface());
            ob2.start();
        }
    }
}
