package com.softtech.java.training.pattern.chain;


public class CheckZero extends AbstractCheckInteger {

    public CheckZero(final AbstractCheckInteger nextCheckIntegerParam) {
        super(nextCheckIntegerParam);
    }

    @Override
    public boolean check(final int valueParam) {
        if (valueParam == 0) {
            System.out.println("Girilen değer sıfır");
            return true;
        }
        return false;
    }

}
