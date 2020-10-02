package com.training.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class MyWS {

    public String hello(@WebParam(name = "name") final String name,
                        @WebParam(name = "surname") final String surname) {
        return "Hello world " + name + " " + surname;
    }


    public String goodbye(@WebParam(name = "name") final String name,
                          @WebParam(name = "surname") final String surname,
                          @WebParam(name = "age") final int age) {
        return "Goodbye " + name + " " + surname + " " + age;
    }

}
