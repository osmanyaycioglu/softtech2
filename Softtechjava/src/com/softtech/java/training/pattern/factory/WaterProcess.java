package com.softtech.java.training.pattern.factory;


public class WaterProcess implements IProcess {

    @Override
    public String start(final int aParam) {
        return aParam + " litre su process ediliyor";
    }

    @Override
    public String stop(final String bParam) {
        return "Su process işlemi " + bParam + " için bitti";
    }

}
