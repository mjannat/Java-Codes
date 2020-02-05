/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rosetta;

/**
 *
 * @author Mim Jannat
 */
public class MyThreadInterface implements Runnable{
    public void run()
    {
         try {
            System.out.println("Thread Interface Object " + Thread.currentThread().getId());
        } catch (Exception e) {
        }
    }
}
