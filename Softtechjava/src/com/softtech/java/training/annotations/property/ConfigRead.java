package com.softtech.java.training.annotations.property;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigRead {

    public ApplicationProperties readProperties() {
        try {
            File fileLoc = new File("app.properties");
            FileInputStream fileInputStreamLoc = new FileInputStream(fileLoc);
            Properties propertiesLoc = new Properties();
            propertiesLoc.load(fileInputStreamLoc);
            ApplicationProperties applicationPropertiesLoc = new ApplicationProperties();
            applicationPropertiesLoc.setAppName(propertiesLoc.getProperty("app.appName"));
            applicationPropertiesLoc.setHost(propertiesLoc.getProperty("app.host"));
            applicationPropertiesLoc.setTest(propertiesLoc.getProperty("app.test"));
            applicationPropertiesLoc.setPort(Integer.parseInt(propertiesLoc.getProperty("app.port")));
            applicationPropertiesLoc.setThreadCount(Integer.parseInt(propertiesLoc.getProperty("app.threadCount")));
            return applicationPropertiesLoc;

        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
        return null;
    }
}
