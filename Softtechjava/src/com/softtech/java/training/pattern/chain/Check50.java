package com.softtech.java.training.pattern.chain;


public class Check50 extends AbstractCheckInteger {

    public Check50(final AbstractCheckInteger nextCheckIntegerParam) {
        super(nextCheckIntegerParam);
    }

    @Override
    public boolean check(final int valueParam) {
        if (valueParam > 50) {
            System.out.println("Girilen değer 50 den büyük");
            return true;
        }
        return false;
    }

}
