package com.softtech.java.training.atm;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CustomerManager {

    private final Map<String, Customer> customerMap = new ConcurrentHashMap<>();

    public void init() {
        ICustomerDAO customerDao = CustomerDAOFactory.createCustomerDAO();
        List<Customer> allCustomersLoc = customerDao.getAllCustomers();
        for (Customer customerLoc : allCustomersLoc) {
            this.customerMap.put(customerLoc.getUsername(),
                                 customerLoc);
        }
    }

    public Customer login(final String username,
                          final String password) {
        Customer customerLoc = this.customerMap.get(username);
        if (customerLoc == null) {
            return null;
        }
        if (customerLoc.getPassword()
                       .equals(password)) {
            return customerLoc;
        }
        return null;
    }

}
