package com.softtech.java.training.interfaces;


public class InterfaceRun {

    public static void main(final String[] args) {
        ProcessImpl implLoc = new ProcessImpl();
        System.out.println(implLoc.objectProcess());
    }
}
