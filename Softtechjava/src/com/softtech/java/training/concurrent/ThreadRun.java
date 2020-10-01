package com.softtech.java.training.concurrent;


public class ThreadRun {

    public static void main(final String[] args) {
        for (int iLoc = 0; iLoc < 10; iLoc++) {
            MyFirstthread firstthreadLoc = new MyFirstthread();
            firstthreadLoc.setName("FirstThread : " + iLoc);
            firstthreadLoc.start();
        }
        // firstthreadLoc.interrupt();
    }
}
