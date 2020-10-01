package com.softtech.java.training.annotations.property;

@PropertyFile("app.properties")
public class ApplicationProperties {

    @Property(key = "app.appName")
    private String appName;
    @Property(key = "app.host")
    private String host;
    @Property(key = "app.port")
    private int    port;
    @Property(key = "app.threadCount")
    private int    threadCount;
    @Property(key = "app.test")
    private String test;

    public String getAppName() {
        return this.appName;
    }

    public void setAppName(final String appNameParam) {
        this.appName = appNameParam;
    }

    public String getHost() {
        return this.host;
    }

    public void setHost(final String hostParam) {
        this.host = hostParam;
    }

    public int getPort() {
        return this.port;
    }

    public void setPort(final int portParam) {
        this.port = portParam;
    }

    public int getThreadCount() {
        return this.threadCount;
    }

    public void setThreadCount(final int threadCountParam) {
        this.threadCount = threadCountParam;
    }

    public String getTest() {
        return this.test;
    }

    public void setTest(final String testParam) {
        this.test = testParam;
    }


}
