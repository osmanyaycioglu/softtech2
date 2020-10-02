package com.softtech.java.training.concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MySecondThread extends Thread {

    public static long                 counter      = 0;
    public static AtomicLong           aCounter     = new AtomicLong();

    public long                        localCounter = 0;
    private final CountDownLatch       countDownLatch;
    private static final Lock          lock         = new ReentrantLock(true);
    private static final ReadWriteLock rwlock       = new ReentrantReadWriteLock();

    public MySecondThread(final CountDownLatch countDownLatchParam) {
        this.countDownLatch = countDownLatchParam;
    }

    public void increaseWrong() {
        synchronized (this) {
            MySecondThread.counter++;
        }
    }

    public void increase() {
        synchronized (MySecondThread.class) {
            MySecondThread.counter++;
        }
    }

    public long getC() {
        synchronized (MySecondThread.class) {
            return MySecondThread.counter;
        }
    }

    public void increaseLock() {
        try {
            MySecondThread.lock.tryLock(2_000,
                                        TimeUnit.MILLISECONDS);
            MySecondThread.counter++;
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        } finally {

            MySecondThread.lock.unlock();
        }
    }

    @Override
    public void run() {
        for (int iLoc = 0; iLoc < 100_000_000; iLoc++) {
            // MySecondThread.counter++;
            // this.increase();
            // MySecondThread.aCounter.incrementAndGet();
            this.increaseLock();
            // this.localCounter++;
        }
        System.out.println("Thread Name : "
                           + Thread.currentThread()
                                   .getName()
                           + " finished.");
        this.countDownLatch.countDown();
    }

    public long getLocalCounter() {
        return this.localCounter;
    }
}
