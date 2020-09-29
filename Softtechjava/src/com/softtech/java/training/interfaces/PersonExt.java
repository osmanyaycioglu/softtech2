package com.softtech.java.training.interfaces;

import java.util.Iterator;

import com.softtech.java.training.Person;
import com.softtech.java.training.pattern.factory.IProcess;

public abstract class PersonExt extends Person implements IProcess, Iterable<String> {


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
