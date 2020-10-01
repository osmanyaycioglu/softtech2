package com.softtech.java.training.concurrent;


public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread Name : "
                           + Thread.currentThread()
                                   .getName());
    }

}
