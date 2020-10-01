package com.softtech.java.training.enums;


public enum EState {

    CREATED(10, "APP created"),
    BOOTING(20, "APP is now booting"),
    RUNNING(30, "APP is now running"),
    PAUSED(40, "APP paused") {

        @Override
        public void myMethod() {
            System.out.println("Merhaba Dünya");
        }
    },
    STOPPED(50, "APP stopped");

    private final int    value;
    private final String desc;

    private EState(final int value,
                   final String desc) {
        this.value = value;
        this.desc = desc;
    }

    public int getValue() {
        return this.value;
    }

    public String getDesc() {
        return this.desc;
    }

    public void myMethod() {
        System.out.println("Hello");
    }

    public static EState getState(final int data) {
        EState[] valuesLoc = EState.values();
        for (EState eStateLoc : valuesLoc) {
            if (eStateLoc.getValue() == data) {
                return eStateLoc;
            }
        }
        return null;
    }

}
