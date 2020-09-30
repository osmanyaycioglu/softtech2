package com.softtech.java.training.atm;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Account {

    private String     name;
    private BigDecimal amount;

    public Account() {

    }

    public Account(final String nameParam,
                   final BigDecimal amountParam) {
        super();
        this.name = nameParam;
        this.amount = amountParam;
    }

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

    public static List<Account> parse(final String accountStr) {
        return Arrays.stream(accountStr.split(";"))
                     .map(s -> s.split("#"))
                     .filter(r -> r.length == 2)
                     .map(sa -> new Account(sa[0],
                                            new BigDecimal(sa[1])))
                     .collect(Collectors.toList());
    }

    public static void main(final String[] args) {
        String[] splitLoc = "TL#100".split("#");
        System.out.println(splitLoc);
    }
}
