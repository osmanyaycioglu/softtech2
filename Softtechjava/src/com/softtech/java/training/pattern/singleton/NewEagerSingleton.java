package com.softtech.java.training.pattern.singleton;


public enum NewEagerSingleton {

    INSTANCE,
    INTANCE2,
    INTANCE3;

    public void hello() {
        System.out.println("Hello world");
    }
}
