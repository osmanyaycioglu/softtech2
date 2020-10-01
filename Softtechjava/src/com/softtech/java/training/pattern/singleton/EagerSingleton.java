package com.softtech.java.training.pattern.singleton;


public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return EagerSingleton.instance;
    }

    public void hello() {
        System.out.println("Hello world");
    }
}
