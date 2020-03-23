package com;

public class AnonymousClass {
    public static void main(String[] args) {
        A obj = new A() {
            @Override
            public void print1() {
                System.out.println("Hello");
            }
        };
        obj.print1();
    }
}

interface A {
    public void print1();
}