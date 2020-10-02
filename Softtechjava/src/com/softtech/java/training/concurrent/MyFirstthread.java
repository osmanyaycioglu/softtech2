package com.softtech.java.training.concurrent;

import java.util.concurrent.BlockingQueue;

public class MyFirstthread extends Thread {

    private final BlockingQueue<Runnable> runs;

    public MyFirstthread(final BlockingQueue<Runnable> runsParam) {
        super();
        this.runs = runsParam;
    }

    @Override
    public void run() {
        while (true) {
            try {
                // BLOCKING
                Runnable pollLoc = this.runs.take();
                pollLoc.run();
                // NOT BLOCKING
                //                Runnable pollLoc = this.runs.poll();
                //                if (pollLoc != null) {
                //                    pollLoc.run();
                //                } else {
                //                    Thread.sleep(10);
                //                }
            } catch (Exception eLoc) {
                eLoc.printStackTrace();
            }
        }
    }
    //    @Override
    //    public void run() {
    //        while (true) {
    //            try {
    //                System.out.println("Thread id :" + this.getName());
    //                Thread.sleep(1_000);
    //                if (this.isInterrupted()) {
    //                    return;
    //                }
    //            } catch (InterruptedException eLoc) {
    //                return;
    //            } catch (Exception eLoc) {
    //                eLoc.printStackTrace();
    //            }
    //        }
    //    }

}
