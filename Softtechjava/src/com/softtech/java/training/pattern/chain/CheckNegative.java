package com.softtech.java.training.pattern.chain;


public class CheckNegative extends AbstractCheckInteger {

    public CheckNegative(final AbstractCheckInteger nextCheckIntegerParam) {
        super(nextCheckIntegerParam);
    }

    @Override
    public boolean check(final int valueParam) {
        if (valueParam < 0) {
            System.out.println("Girilen değer negatif");
            return true;
        }
        return false;
    }

}
