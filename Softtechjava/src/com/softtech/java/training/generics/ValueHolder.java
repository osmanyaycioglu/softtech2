package com.softtech.java.training.generics;


public class ValueHolder<T extends Comparable<T>> {

    private T value;


    public T getValue() {
        return this.value;
    }

    public void setValue(final T valueParam) {
        this.value = valueParam;
    }

    public boolean process(final T other) {
        return this.value.compareTo(other) > 0 ? true : false;
    }

}
