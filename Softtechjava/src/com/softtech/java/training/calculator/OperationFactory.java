package com.softtech.java.training.calculator;

import java.util.function.BiFunction;

public class OperationFactory {

    public static BiFunction<Integer, Integer, String> getOperation(final int nextIntParam) {
        switch (nextIntParam) {
            case 1:
                return (a,
                        b) -> "" + (a + b);
            case 2:
                return (a,
                        b) -> "" + (a - b);
            case 3:
                return (a,
                        b) -> "" + (a * b);
            case 4:
                //                return (a,
                //                        b) -> {
                //                    if (b == 0) {
                //                        return "NAN";
                //                    }
                //                    return "" + (a / b);
                //                };
                return (a,
                        b) -> b == 0 ? "NAN" : ("" + (a / b));

            default:
                return (a,
                        b) -> "Not available";
        }
    }

}
