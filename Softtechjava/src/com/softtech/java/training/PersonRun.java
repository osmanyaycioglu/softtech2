package com.softtech.java.training;


public class PersonRun {

    public static void main(final String[] args) {
        Person personLoc = new Person("osman",
                                      "yay",
                                      "os@os.com",
                                      "IT",
                                      50);

        Person personLoc3 = Person.createFullPersonObject("osman",
                                                          "yay",
                                                          "os@os.com",
                                                          "IT",
                                                          50);


        Person personLoc2 = new Person("osman",
                                       "yay",
                                       "IT",
                                       50);

        Person personLoc4 = Person.createPersonObjectWithoutEmail("osman",
                                                                  "yay",
                                                                  "IT",
                                                                  50);

        Person personLoc5 = Person.createPersonObjectWithoutDepartment("osman",
                                                                       "yay",
                                                                       "os@os.com",
                                                                       50);

    }
}
