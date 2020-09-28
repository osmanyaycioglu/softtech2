package com.softtech.java.training.pattern.chain;


public class CheckFactory {

    public static AbstractCheckInteger createCheckProcess() {
        return new Check50(new CheckZero(new CheckPositive(new CheckNegative(null))));
    }
}
