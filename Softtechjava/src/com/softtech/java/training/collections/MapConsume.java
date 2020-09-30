package com.softtech.java.training.collections;

import java.util.function.BiConsumer;

import com.softtech.java.training.pattern.builder.Employee;

public class MapConsume implements BiConsumer<String, Employee> {

    @Override
    public void accept(final String k,
                       final Employee v) {
        System.out.println("Key : " + k + " value : " + v);
    }

}
