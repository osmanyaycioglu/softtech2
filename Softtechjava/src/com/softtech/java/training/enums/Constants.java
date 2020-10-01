package com.softtech.java.training.enums;


public class Constants {

    public static final int RERTY_COUNT  = 10;
    public static final int RUN_COUNT    = 10;
    public static final int PAUSED_COUNT = 20;

    public void name(final int count) {
        if (count == Constants.RERTY_COUNT) {
            for (int iLoc = 0; iLoc < Constants.RERTY_COUNT; iLoc++) {
                System.out.println("" + iLoc);
            }
        } else if (count == Constants.PAUSED_COUNT) {
            for (int iLoc = Constants.RUN_COUNT; iLoc < Constants.PAUSED_COUNT; iLoc++) {
                System.out.println("" + iLoc);
            }
        }
    }
}
