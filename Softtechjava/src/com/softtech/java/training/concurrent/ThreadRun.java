package com.softtech.java.training.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadRun {

    public static void main(final String[] args) {
        BlockingQueue<Runnable> runnablesLoc = new ArrayBlockingQueue<>(10_000);

        for (int iLoc = 0; iLoc < 10; iLoc++) {
            MyFirstthread firstthreadLoc = new MyFirstthread(runnablesLoc);
            firstthreadLoc.setName("FirstThread : " + iLoc);
            firstthreadLoc.start();
        }
        MyRunnable myRunnableLoc = new MyRunnable();
        runnablesLoc.add(myRunnableLoc);

        // firstthreadLoc.interrupt();
    }
}
