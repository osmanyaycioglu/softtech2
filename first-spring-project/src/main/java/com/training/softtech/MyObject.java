package com.training.softtech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyObject {

    @Autowired
    private MyConfig config;


    public MyConfig getConfig() {
        return this.config;
    }


    public void setConfig(final MyConfig configParam) {
        this.config = configParam;
    }

}
