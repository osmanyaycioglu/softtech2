package com.softtech.java.training.pattern.factory;


public class WaterV2Process implements IProcess {

    @Override
    public String start(final int aParam) {
        return aParam + " tanker su process ediliyor";
    }

    @Override
    public String stop(final String bParam) {
        return "Su process işlemi " + bParam + " için bitti";
    }

}
