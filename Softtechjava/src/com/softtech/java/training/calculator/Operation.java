package com.softtech.java.training.calculator;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class Operation<T, U, R> implements IOperation<T, U, R> {

    private final Supplier<String>    strSupplier;
    private final BiFunction<T, U, R> opBiFunction;

    public Operation(final Supplier<String> strSupplierParam,
                     final BiFunction<T, U, R> opBiFunctionParam) {
        super();
        this.strSupplier = strSupplierParam;
        this.opBiFunction = opBiFunctionParam;
    }

    @Override
    public Supplier<String> menuText() {
        return this.strSupplier;
    }

    @Override
    public BiFunction<T, U, R> operation() {
        return this.opBiFunction;
    }


}
