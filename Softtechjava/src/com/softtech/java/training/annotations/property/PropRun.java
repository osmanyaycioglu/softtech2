package com.softtech.java.training.annotations.property;


public class PropRun {

    public static void main(final String[] args) {
        ConfigRead configReadLoc = new ConfigRead();
        ApplicationProperties readPropertiesLoc = configReadLoc.readProperties();

        ApplicationProperties applicationPropertiesLoc = new ApplicationProperties();
        PropertyEngine propertyEngineLoc = new PropertyEngine();
        propertyEngineLoc.process(applicationPropertiesLoc);

        SecondPropObject secondPropObjectLoc = new SecondPropObject();
        propertyEngineLoc.process(secondPropObjectLoc);
    }
}
