package com.softtech.java.training.atm;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.softtech.java.training.annotations.validation.ValidateResult;
import com.softtech.java.training.annotations.validation.ValidationEngine;

public class CustomerManager {

    private final Map<String, Customer> customerMap = new ConcurrentHashMap<>();

    public void init() {
        ValidationEngine ve = new ValidationEngine();
        ICustomerDAO customerDao = CustomerDAOFactory.createCustomerDAO();
        List<Customer> allCustomersLoc = customerDao.getAllCustomers();
        for (Customer customerLoc : allCustomersLoc) {
            ValidateResult validateLoc = ve.validate(customerLoc);
            if (validateLoc.getStatus() == 0) {
                this.customerMap.put(customerLoc.getUsername(),
                                     customerLoc);
            } else {
                List<String> errorDescLoc = validateLoc.getErrorDesc();
                for (String error : errorDescLoc) {
                    System.out.println("Validation error for : " + customerLoc);
                    System.out.println(error);
                }
            }
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
