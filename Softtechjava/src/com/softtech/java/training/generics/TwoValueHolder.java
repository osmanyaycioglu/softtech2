package com.softtech.java.training.generics;


public class TwoValueHolder<T, V> {

    private T value1;
    private V value2;

    public T getValue1() {
        return this.value1;
    }

    public void setValue1(final T value1Param) {
        this.value1 = value1Param;
    }

    public V getValue2() {
        return this.value2;
    }

    public void setValue2(final V value2Param) {
        this.value2 = value2Param;
    }


}
