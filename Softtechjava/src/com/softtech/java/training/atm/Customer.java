package com.softtech.java.training.atm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.softtech.java.training.annotations.validation.ValidateList;
import com.softtech.java.training.annotations.validation.ValidateStr;

public class Customer {

    @ValidateStr(min = 2, max = 30)
    private String        name;
    @ValidateStr(min = 2, max = 50)
    private String        surname;
    @ValidateStr(min = 8, max = 20)
    private String        username;
    @ValidateStr(min = 6, max = 15)
    private String        password;
    @ValidateList(max = Integer.MAX_VALUE)
    private List<Account> accountList;
    private boolean       active;


    public Customer() {
    }


    public Customer(final String nameParam,
                    final String surnameParam,
                    final String usernameParam,
                    final String passwordParam,
                    final List<Account> accountListParam,
                    final boolean activeParam) {
        super();
        this.name = nameParam;
        this.surname = surnameParam;
        this.username = usernameParam;
        this.password = passwordParam;
        this.accountList = accountListParam;
        this.active = activeParam;
    }


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

    public String getUsername() {
        return this.username;
    }

    public void setUsername(final String usernameParam) {
        this.username = usernameParam;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(final String passwordParam) {
        this.password = passwordParam;
    }

    public List<Account> getAccountList() {
        return new ArrayList<>(this.accountList);
    }

    public Iterator<Account> getAccountListIterator() {
        return this.accountList.iterator();
    }

    public void addAccount(final Account accountParam) {
        if (this.accountList == null) {
            this.accountList = new ArrayList<>();
        }
        this.accountList.add(accountParam);
    }

    public boolean isActive() {
        return this.active;
    }

    public void setActive(final boolean activeParam) {
        this.active = activeParam;
    }

}
