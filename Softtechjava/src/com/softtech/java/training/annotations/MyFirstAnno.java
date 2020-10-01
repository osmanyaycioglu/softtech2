package com.softtech.java.training.annotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;


@Retention(RUNTIME)
@Target({
          TYPE,
          FIELD,
          METHOD
})
@Documented
public @interface MyFirstAnno {

    String value() default "1234";

    String valStr() default "test";

    int prt() default 15;
}
