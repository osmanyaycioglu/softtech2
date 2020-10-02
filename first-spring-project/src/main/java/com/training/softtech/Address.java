package com.training.softtech;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    @GeneratedValue
    private long   addId;

    private String city;
    private String street;

    public String getCity() {
        return this.city;
    }

    public void setCity(final String cityParam) {
        this.city = cityParam;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(final String streetParam) {
        this.street = streetParam;
    }

    public long getAddId() {
        return this.addId;
    }

    public void setAddId(final long addIdParam) {
        this.addId = addIdParam;
    }


}
