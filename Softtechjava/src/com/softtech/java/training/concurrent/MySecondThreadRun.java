package com.softtech.java.training.concurrent;

import java.util.concurrent.CountDownLatch;

public class MySecondThreadRun {

    public static void main(final String[] args) {
        CountDownLatch countDownLatchLoc = new CountDownLatch(10);
        MySecondThread[] threadsLoc = new MySecondThread[10];
        for (int iLoc = 0; iLoc < 10; iLoc++) {
            MySecondThread mySecondThreadLoc = new MySecondThread(countDownLatchLoc);
            mySecondThreadLoc.setName("S" + iLoc);
            mySecondThreadLoc.start();
            threadsLoc[iLoc] = mySecondThreadLoc;
        }

        try {
            countDownLatchLoc.await();
        } catch (Exception eLoc) {
        }
        long totalCounter = 0;
        for (MySecondThread mySecondThreadLoc : threadsLoc) {
            totalCounter += mySecondThreadLoc.getLocalCounter();
        }

        System.out.println("Counter : " + MySecondThread.counter);
        System.out.println("Counter : " + totalCounter);
        System.out.println("Counter : " + MySecondThread.aCounter.get());
    }
}
