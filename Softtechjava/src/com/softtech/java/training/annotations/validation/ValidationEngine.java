package com.softtech.java.training.annotations.validation;

import java.lang.reflect.Field;
import java.util.List;

public class ValidationEngine {

    public ValidateResult validate(final Object obj) {
        ValidateResult resultLoc = new ValidateResult();
        Class<?> classLoc = obj.getClass();
        try {
            Field[] declaredFieldsLoc = classLoc.getDeclaredFields();
            for (Field fieldLoc : declaredFieldsLoc) {
                ValidateStr validateStrLoc = fieldLoc.getAnnotation(ValidateStr.class);
                if (validateStrLoc != null) {
                    Class<?> typeLoc = fieldLoc.getType();
                    fieldLoc.setAccessible(true);
                    if (typeLoc == String.class) {
                        String filedValueLoc = (String) fieldLoc.get(obj);
                        if (filedValueLoc == null) {
                            resultLoc.addErrorDesc("Field : " + fieldLoc.getName() + " null olamaz");
                        } else {
                            if ((filedValueLoc.length() < validateStrLoc.min())
                                || (filedValueLoc.length() > validateStrLoc.max())) {
                                resultLoc.addErrorDesc("Field : "
                                                       + fieldLoc.getName()
                                                       + " uzunluğu "
                                                       + validateStrLoc.min()
                                                       + " ile "
                                                       + validateStrLoc.max()
                                                       + " arasında olmalı. Fakat uzunluk : "
                                                       + filedValueLoc.length());
                            }
                        }
                    }
                }
                ValidateList listValidateLoc = fieldLoc.getAnnotation(ValidateList.class);
                if (listValidateLoc != null) {
                    Class<?> typeLoc = fieldLoc.getType();
                    fieldLoc.setAccessible(true);
                    if (typeLoc.isAssignableFrom(List.class)) {
                        List<?> objectLoc = (List<?>) fieldLoc.get(obj);
                        if (objectLoc == null) {
                            resultLoc.addErrorDesc("Field : " + fieldLoc.getName() + " null olamaz");
                        } else {
                            if ((objectLoc.size() < listValidateLoc.min())
                                || (objectLoc.size() > listValidateLoc.max())) {
                                resultLoc.addErrorDesc("Field : "
                                                       + fieldLoc.getName()
                                                       + " Liste  uzunluğu "
                                                       + listValidateLoc.min()
                                                       + " ile "
                                                       + listValidateLoc.max()
                                                       + " arasında olmalı. Fakat uzunluk : "
                                                       + objectLoc.size());
                            }
                        }
                    }
                }
            }
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
        return resultLoc;
    }
}
