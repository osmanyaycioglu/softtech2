package com.softtech.java.training.generics;

import com.softtech.java.training.Person;

public class GenericRun2 {

    public static void main(final String[] args) {
        TwoValueHolder<String, Integer> strInTwoValueHolderLoc = new TwoValueHolder<>();
        strInTwoValueHolderLoc.setValue1("str");
        strInTwoValueHolderLoc.setValue2(100);
        TwoValueHolder<?, ?> genricGenericLoc = strInTwoValueHolderLoc;

        TwoValueHolder<Integer, Integer> genricGenericLoc2 = new TwoValueHolder<>();

        GenericRun2.add("dslkfhjsd",
                        "dsfkjsd");
        GenericRun2.add(100,
                        100);

        GenericRun2.add(Person.createFullPersonObject("osman",
                                                      null,
                                                      null,
                                                      null,
                                                      0),
                        Person.createFullPersonObject("ali",
                                                      null,
                                                      null,
                                                      null,
                                                      0));

        //        GenericRun2.add(Employee.getBuilder()
        //                                .name("osman")
        //                                .buildFullObject(),
        //                        Employee.getBuilder()
        //                                .name("ali"));
    }

    public static <B extends Comparable<B>> String add(final B a1,
                                                       final B a2) {
        int compareToLoc = a1.compareTo(a2);
        return "" + a1 + a2 + " compare : " + compareToLoc;

    }

}
