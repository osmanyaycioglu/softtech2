package com.softtech.java.training.interfaces;

import com.softtech.java.training.pattern.factory.IProcess;

public class ProcessImpl implements IProcess {

    @Override
    public String start(final int aParam) {
        return "" + aParam + " processed";
    }

    @Override
    public String stop(final String bParam) {
        return bParam + " finished.";
    }

}
