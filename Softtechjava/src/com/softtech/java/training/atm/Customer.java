package com.softtech.java.training.atm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {

    private String        name;
    private String        surname;
    private String        username;
    private String        password;
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
