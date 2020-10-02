package com.training.softtech;

import org.springframework.stereotype.Component;

@Component
public class MySpringBean {

    private int counter;

    public void execute() {
        System.out.println("Execution : " + ++this.counter);
    }
}
