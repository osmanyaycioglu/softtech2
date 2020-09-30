package com.softtech.java.training.calculator;

import java.util.ArrayList;
import java.util.List;

public class OperationFactory2 {

    public static List<IOperation<Integer, Integer, String>> getOperation() {
        List<IOperation<Integer, Integer, String>> opListLoc = new ArrayList<>();
        opListLoc.add(new Operation<>(() -> "Toplama",
                                      (a,
                                       b) -> "" + (a + b)));
        opListLoc.add(new Operation<>(() -> "Çıkarma",
                                      (a,
                                       b) -> "" + (a - b)));
        opListLoc.add(new Operation<>(() -> "Çarpma",
                                      (a,
                                       b) -> "" + (a * b)));
        opListLoc.add(new Operation<>(() -> "Bölme",
                                      (a,
                                       b) -> b == 0 ? "NAN" : ("" + (a / b))));

        return opListLoc;
    }


}
