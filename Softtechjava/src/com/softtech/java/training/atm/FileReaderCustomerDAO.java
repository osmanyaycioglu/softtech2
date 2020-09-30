package com.softtech.java.training.atm;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileReaderCustomerDAO implements ICustomerDAO {

    @Override
    public List<Customer> getAllCustomers() {
        try {
            Path path = Paths.get("customer.txt");
            List<String> readAllLinesLoc = Files.readAllLines(path);
            return readAllLinesLoc.stream()
                                  .distinct()
                                  .map(l -> l.split(","))
                                  .filter(r -> r.length == 6)
                                  .map(sa -> new Customer(sa[0],
                                                          sa[1],
                                                          sa[2],
                                                          sa[3],
                                                          Account.parse(sa[5]),
                                                          Boolean.parseBoolean(sa[4])))
                                  .filter(c -> c.isActive())
                                  .collect(Collectors.toList());

        } catch (Exception eLoc) {
            eLoc.printStackTrace();;
        }
        return new ArrayList<>();
    }

}
