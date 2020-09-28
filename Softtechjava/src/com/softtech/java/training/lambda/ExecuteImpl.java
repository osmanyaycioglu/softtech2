package com.softtech.java.training.lambda;


public class ExecuteImpl implements IExecute {

    @Override
    public String execute(final String strParam) {
        return "Hello " + strParam;
    }

}
