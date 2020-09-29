package com.softtech.java.training.generics;

import com.softtech.java.training.Person;

public class GenericRun {

    public static void main(final String[] args) {
        ValueHolder<Double> holderLoc = new ValueHolder<>();
        holderLoc.setValue(100D);

        Double valueLoc = holderLoc.getValue();

        ValueHolder<String> holderStringLoc = new ValueHolder<>();
        holderStringLoc.setValue("asjkdlak");

        String value6Loc = holderStringLoc.getValue();


        ValueHolder<Person> holderLoc2 = new ValueHolder<>();
        holderLoc2.setValue(Person.createFullPersonObject("osman",
                                                          "yay",
                                                          null,
                                                          null,
                                                          10));
        Person value2Loc = holderLoc2.getValue();

        Object objectLoc = Person.createFullPersonObject("osman",
                                                         "yay",
                                                         null,
                                                         null,
                                                         10);
        Object object2Loc = new Integer(10);
        Object object3Loc = new Exception();

        ValueObjectHolder objectHolderLoc = new ValueObjectHolder();
        objectHolderLoc.setValue(100);
        objectHolderLoc.setValue("asuııudh");

        Object value3Loc = objectHolderLoc.getValue();

        if (value3Loc instanceof Integer) {
            Integer value5Loc = (Integer) objectHolderLoc.getValue();
        } else if (value3Loc instanceof String) {
            String stringLoc = (String) objectHolderLoc.getValue();
        }

        Integer value4Loc = (Integer) objectHolderLoc.getValue();
    }

}
