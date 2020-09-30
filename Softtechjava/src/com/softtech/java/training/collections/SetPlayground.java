package com.softtech.java.training.collections;

import java.util.HashSet;
import java.util.Set;

public class SetPlayground {

    public static void main(final String[] args) {
        Set<String> strSet = new HashSet<>();
        // Set<String> strSet = new TreeSet<>();
        strSet.add("1");
        strSet.add("1");
        strSet.add("1");
        strSet.add("5");
        strSet.add("1");
        strSet.add("1");
        strSet.add("3");
        strSet.add("2");

        for (String stringLoc : strSet) {
            System.out.println(stringLoc);
        }


        Set<String> strSet2 = new HashSet<>();
        strSet2.add("5");
        strSet2.add("4");
        strSet2.add("3");
        strSet2.add("6");
        strSet2.add("7");

        // strSet.retainAll(strSet2);
        // strSet.removeAll(strSet2);
        strSet.addAll(strSet2);
        System.out.println("-------------------");
        for (String stringLoc : strSet) {
            System.out.println(stringLoc);
        }
        Set<String> strSet3 = new HashSet<>();

        long delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            strSet3.add("test" + iLoc);
        }
        System.out.println("Add Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            strSet3.contains("test" + iLoc);
        }
        System.out.println("Contains Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            strSet3.remove("test" + iLoc);
        }
        System.out.println("Remove Delta : " + (System.currentTimeMillis() - delta));

    }
}
