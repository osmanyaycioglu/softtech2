package com.softtech.java.training.annotations;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class AnnoReflection {

    public static void main(final String[] args) {
        Class<MyAnnoUsage> myAnnoClassLoc = MyAnnoUsage.class;
        Field[] declaredFieldsLoc = myAnnoClassLoc.getDeclaredFields();
        for (Field fieldLoc : declaredFieldsLoc) {
            System.out.println("Field : " + fieldLoc.getName());
            MyFirstAnno annotationLoc = fieldLoc.getAnnotation(MyFirstAnno.class);
            if (annotationLoc != null) {
                System.out.println("Field : "
                                   + fieldLoc.getName()
                                   + " MyFirsAnno value : "
                                   + annotationLoc.value()
                                   + " valStr : "
                                   + annotationLoc.valStr()
                                   + " ptr : "
                                   + annotationLoc.prt());
            }
        }

        Method[] declaredMethodsLoc = myAnnoClassLoc.getDeclaredMethods();
        for (Method methodLoc : declaredMethodsLoc) {
            System.out.println("Method : " + methodLoc.getName());
            Parameter[] parametersLoc = methodLoc.getParameters();
            MyFirstAnno annotationLoc = methodLoc.getAnnotation(MyFirstAnno.class);
            if (annotationLoc != null) {
                System.out.println("Field : "
                                   + methodLoc.getName()
                                   + " MyFirsAnno value : "
                                   + annotationLoc.value()
                                   + " valStr : "
                                   + annotationLoc.valStr()
                                   + " ptr : "
                                   + annotationLoc.prt());
            }
            if ((parametersLoc != null) && (parametersLoc.length > 0)) {
                for (Parameter paramLoc : parametersLoc) {
                    System.out.println("Method Param : "
                                       + paramLoc.getType()
                                                 .getName());
                }
            }
        }
    }
}
