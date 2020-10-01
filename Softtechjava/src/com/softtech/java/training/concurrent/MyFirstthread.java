package com.softtech.java.training.concurrent;


public class MyFirstthread extends Thread {

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Thread id :" + this.getName());
                Thread.sleep(1_000);
                if (this.isInterrupted()) {
                    return;
                }
            } catch (InterruptedException eLoc) {
                return;
            } catch (Exception eLoc) {
                eLoc.printStackTrace();
            }
        }
    }

}
