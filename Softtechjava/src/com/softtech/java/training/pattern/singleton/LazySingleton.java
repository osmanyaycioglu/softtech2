package com.softtech.java.training.pattern.singleton;


public class LazySingleton {

    private static volatile LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (LazySingleton.instance == null) {
            synchronized (LazySingleton.class) {
                if (LazySingleton.instance == null) {
                    LazySingleton.instance = new LazySingleton();
                }
            }
        }
        return LazySingleton.instance;
    }

    public void hello() {
        System.out.println("Hello world");
    }
}
