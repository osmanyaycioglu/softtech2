package com.softtech.java.training.interfaces;

import java.util.Iterator;

import com.softtech.java.training.Person;

public abstract class PersonExt extends Person implements IProcess, Iterable<String>, Comparable<String> {


    @Override
    public Iterator<String> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String start(final int aParam) {
        // TODO Auto-generated method stub
        return null;
    }


}
