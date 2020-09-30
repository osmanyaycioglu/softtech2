package com.softtech.java.training.atm;


public class CustomerDAOFactory {

    public static ICustomerDAO createCustomerDAO() {
        // return new StaticCustomerDAO();
        return new FileReaderCustomerDAO();
    }

}
