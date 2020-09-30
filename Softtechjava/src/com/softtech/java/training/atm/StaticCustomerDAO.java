package com.softtech.java.training.atm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StaticCustomerDAO implements ICustomerDAO {

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> customersLoc = new ArrayList<>();

        // Customer 1
        Customer customerLoc = new Customer();
        customerLoc.setName("osman");
        customerLoc.setSurname("yaycıoğlu");
        customerLoc.setUsername("osmanyay");
        customerLoc.setPassword("123456");
        Account accountLoc = new Account();
        accountLoc.setName("TL");
        accountLoc.setAmount(new BigDecimal(1_000));
        customerLoc.addAccount(accountLoc);
        accountLoc = new Account();
        accountLoc.setName("DOLAR");
        accountLoc.setAmount(new BigDecimal(10_000));
        customerLoc.addAccount(accountLoc);
        customersLoc.add(customerLoc);

        // Customer 2
        customerLoc = new Customer();
        customerLoc.setName("ali");
        customerLoc.setSurname("veli");
        customerLoc.setUsername("aliv");
        customerLoc.setPassword("123456");
        accountLoc = new Account();
        accountLoc.setName("TL");
        accountLoc.setAmount(new BigDecimal(2_000));
        customerLoc.addAccount(accountLoc);
        accountLoc = new Account();
        accountLoc.setName("DOLAR");
        accountLoc.setAmount(new BigDecimal(100));
        customerLoc.addAccount(accountLoc);
        customersLoc.add(customerLoc);

        return customersLoc;
    }

}
