package com.softtech.java.training.pattern.chain;


public class CheckPositive extends AbstractCheckInteger {

    public CheckPositive(final AbstractCheckInteger nextCheckIntegerParam) {
        super(nextCheckIntegerParam);
    }

    @Override
    public boolean check(final int valueParam) {
        if (valueParam > 0) {
            System.out.println("Girilen değer positif");
            return true;
        }
        return false;
    }

}
