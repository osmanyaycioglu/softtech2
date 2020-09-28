package com.softtech.java.training.lambda;

import java.math.BigDecimal;

@FunctionalInterface
public interface IPrint {

    void print(int intVal,
               String strVal,
               Double d,
               BigDecimal bd);

}
