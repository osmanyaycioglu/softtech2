package com.softtech.java.training.calculator;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public interface IOperation<T, U, R> {

    Supplier<String> menuText();

    BiFunction<T, U, R> operation();

}
