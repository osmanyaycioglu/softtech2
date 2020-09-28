package com.softtech.java.training.interfaces;


public interface IProcess {

    public static String VAR_TEST = "test";

    String start(int a);

    String stop(String b);

    public static String staticProcess() {
        return "Hello";
    }

    public default String objectProcess() {
        String startLoc = this.start(100);
        return this.stop(startLoc);
    }

    public default String objectProcess2() {
        String startLoc = this.start(102);
        return this.stop(startLoc);
    }

}
