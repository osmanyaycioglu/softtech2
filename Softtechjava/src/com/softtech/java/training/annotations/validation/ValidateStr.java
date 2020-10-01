package com.softtech.java.training.annotations.validation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;


@Retention(RUNTIME)
@Target({
          ElementType.FIELD
})
public @interface ValidateStr {

    int max();

    int min();
}
