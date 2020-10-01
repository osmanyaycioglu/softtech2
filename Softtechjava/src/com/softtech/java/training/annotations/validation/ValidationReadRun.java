package com.softtech.java.training.annotations.validation;

import java.lang.reflect.Field;

import com.softtech.java.training.atm.Customer;

public class ValidationReadRun {

    public static void main(final String[] args) {
        Class<Customer> cusClassLoc = Customer.class;
        Field[] declaredFieldsLoc = cusClassLoc.getDeclaredFields();
        for (Field fieldLoc : declaredFieldsLoc) {
            System.out.println("Field : " + fieldLoc.getName());
            ValidateStr annotationLoc = fieldLoc.getAnnotation(ValidateStr.class);
            if (annotationLoc != null) {
                System.out.println("Field : "
                                   + fieldLoc.getName()
                                   + " ValidateStr min : "
                                   + annotationLoc.min()
                                   + " max : "
                                   + annotationLoc.max());
            }
            ValidateList annotationLoc2 = fieldLoc.getAnnotation(ValidateList.class);
            if (annotationLoc2 != null) {
                System.out.println("Field : "
                                   + fieldLoc.getName()
                                   + " ValidateList min : "
                                   + annotationLoc2.min()
                                   + " max : "
                                   + annotationLoc2.max());
            }
        }
    }
}
