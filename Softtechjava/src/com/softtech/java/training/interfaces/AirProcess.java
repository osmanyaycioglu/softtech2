package com.softtech.java.training.interfaces;


public class AirProcess implements IProcess {

    @Override
    public String start(final int aParam) {
        return aParam + " m3 su process ediliyor";
    }

    @Override
    public String stop(final String bParam) {
        return "Hava process işlemi " + bParam + " için bitti";
    }

}
