package com.softtech.java.training.pattern.singleton;


public class SingletonRun {

    public static void main(final String[] args) {
        EagerSingleton.getInstance()
                      .hello();
        LazySingleton.getInstance()
                     .hello();
        NewEagerSingleton.INSTANCE.hello();

    }
}
