package com.softtech.java.training.enums;


public class EnumRun {

    public static void main(final String[] args) {
        EState eStateLoc = EState.RUNNING;
        switch (eStateLoc) {
            case BOOTING:
                break;
            case CREATED:
                break;
            case PAUSED:
                break;
            case RUNNING:
                break;
            case STOPPED:
                break;
            default:
                break;
        }
    }
}
