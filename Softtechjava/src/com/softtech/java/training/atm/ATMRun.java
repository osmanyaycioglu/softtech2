package com.softtech.java.training.atm;

import java.util.List;
import java.util.Scanner;

public class ATMRun {

    public static void main(final String[] args) {
        CustomerManager customerManagerLoc = new CustomerManager();
        customerManagerLoc.init();

        try (Scanner scannerLoc = new Scanner(System.in)) {
            System.out.println("Username : ");
            String username = scannerLoc.nextLine();
            System.out.println("Password : ");
            String password = scannerLoc.nextLine();
            Customer customerLoc = customerManagerLoc.login(username,
                                                            password);
            if (customerLoc != null) {
                System.out.println("Merhaba " + customerLoc.getName() + " " + customerLoc.getSurname());
                System.out.println("Hesaplarınız");
                List<Account> accountListLoc = customerLoc.getAccountList();
                for (Account accountLoc : accountListLoc) {
                    System.out.println(accountLoc);
                }
            }

        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }

    }
}
