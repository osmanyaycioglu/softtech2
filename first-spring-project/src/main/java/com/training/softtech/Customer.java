package com.training.softtech;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
@Table(name = "musteri")
public class Customer {

    @Id
    @GeneratedValue
    private long    custId;

    @Column(name = "abc", length = 50)
    @Size(min = 6, max = 20)
    private String  name;
    @Size(min = 6, max = 20)
    private String  surname;
    @Max(120)
    @Min(10)
    private int     age;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Address address;

    //    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    //    private List<Address> addressList;
    //
    //    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    //    private List<Address> addressList2;


    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(final int ageParam) {
        this.age = ageParam;
    }

    public long getCustId() {
        return this.custId;
    }

    public void setCustId(final long custIdParam) {
        this.custId = custIdParam;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(final Address addressParam) {
        this.address = addressParam;
    }


}
