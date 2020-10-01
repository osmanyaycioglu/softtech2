package com.softtech.java.training.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

    public static void main(final String[] args) {
        ExecutorService newFixedThreadPoolLoc = Executors.newFixedThreadPool(10);
        for (int iLoc = 0; iLoc < 1_000; iLoc++) {
            MyRunnable myRunnableLoc = new MyRunnable();
            newFixedThreadPoolLoc.execute(myRunnableLoc);
        }
    }
}
