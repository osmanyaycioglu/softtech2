package com.softtech.java.training.annotations.property;

@PropertyFile("second.properties")
public class SecondPropObject {

    @Property(key = "xyz.abc")
    private int    xyz;
    @Property(key = "xyz.dfg")
    private String dfg;

    public int getXyz() {
        return this.xyz;
    }

    public void setXyz(final int xyzParam) {
        this.xyz = xyzParam;
    }

    public String getDfg() {
        return this.dfg;
    }

    public void setDfg(final String dfgParam) {
        this.dfg = dfgParam;
    }


}
