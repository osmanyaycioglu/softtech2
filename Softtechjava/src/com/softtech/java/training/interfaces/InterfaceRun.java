package com.softtech.java.training.interfaces;

import com.softtech.java.training.Person;

public class InterfaceRun {

    public static void main(final String[] args) {
        ProcessImpl implLoc = new ProcessImpl();
        System.out.println(implLoc.objectProcess());

        PersonExtExt abd = new PersonExtExt();
        Person xyz = new PersonExtExt();


    }
}
