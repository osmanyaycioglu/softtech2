package com.softtech.java.training.collections;

import java.util.ArrayList;
import java.util.List;

public class ListPlayground {

    public static void main(final String[] args) {
        List<String> strListLoc = new ArrayList<>(1_100_000);
        // List<String> strListLoc = new LinkedList<>();
        // List<String> strListLoc = new Vector<>();
        List<String> strListLoc2 = new ArrayList<>(1_100_000);
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            strListLoc2.add("test" + iLoc);
        }
        strListLoc2.forEach(v -> System.out.println(v));

        System.gc();

        try {
            Thread.sleep(2000);
        } catch (Exception eLoc) {
        }

        long delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            strListLoc.add("test" + iLoc);
        }
        System.out.println("Add Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000; iLoc++) {
            strListLoc.contains("test" + (iLoc + 100_000));
        }
        System.out.println("Contains Delta : " + (System.currentTimeMillis() - delta));


        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            strListLoc.get(iLoc);
        }
        System.out.println("Get Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000; iLoc++) {
            strListLoc.remove(0);
        }
        System.out.println("Remove Delta : " + (System.currentTimeMillis() - delta));

        for (String stringLoc : strListLoc) {

        }
    }
}
