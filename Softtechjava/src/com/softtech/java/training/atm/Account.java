package com.softtech.java.training.atm;

import java.math.BigDecimal;

public class Account {

    private String     name;
    private BigDecimal amount;

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(final BigDecimal amountParam) {
        this.amount = amountParam;
    }

    @Override
    public String toString() {
        return "Account [name=" + this.name + ", amount=" + this.amount + "]";
    }


}
