package com.softtech.java.training.annotations.property;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.Properties;

public class PropertyEngine {


    public void process(final Object obj) {
        Class<?> classLoc = obj.getClass();
        PropertyFile propFileAnnoLoc = classLoc.getAnnotation(PropertyFile.class);
        if (propFileAnnoLoc != null) {
            try {
                Properties propertiesLoc = new Properties();
                File fileLoc = new File(propFileAnnoLoc.value());
                FileInputStream inputStream = new FileInputStream(fileLoc);
                propertiesLoc.load(inputStream);
                Field[] declaredFieldsLoc = classLoc.getDeclaredFields();
                for (Field fieldLoc : declaredFieldsLoc) {
                    Property fieldAnnoLoc = fieldLoc.getAnnotation(Property.class);
                    if (fieldAnnoLoc != null) {
                        String valueLoc = propertiesLoc.getProperty(fieldAnnoLoc.key());
                        Class<?> typeLoc = fieldLoc.getType();
                        fieldLoc.setAccessible(true);
                        if (typeLoc == String.class) {
                            fieldLoc.set(obj,
                                         valueLoc);
                            String objectLoc = (String) fieldLoc.get(obj);
                        } else if ("int".equals(typeLoc.getName())) {
                            fieldLoc.setInt(obj,
                                            Integer.parseInt(valueLoc));
                        } else if ("long".equals(typeLoc.getName())) {
                            fieldLoc.setLong(obj,
                                             Long.parseLong(valueLoc));
                        }
                    }
                }
            } catch (Exception eLoc) {
                eLoc.printStackTrace();
            }

        }
    }
}
