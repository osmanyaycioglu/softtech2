package com.softtech.java.training.pattern.factory;

public class MudProcess implements IProcess {

    @Override
    public String start(final int aParam) {
        return aParam + " cm3 çamur process ediliyor";
    }

    @Override
    public String stop(final String bParam) {
        return "Çamur process işlemi " + bParam + " için bitti";
    }

}
