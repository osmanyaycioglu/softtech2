package com.softtech.java.training.pattern.builder;


public class EmployeeRun {

    public static void main(final String[] args) {
        Employee emp = Employee.getBuilder()
                               .name("osman")
                               .surname("yay")
                               .email("os@os.com")
                               .age(50)
                               .department("IT")
                               .buildFullObject();

        Employee emp2 = Employee.getBuilder()
                                .name("osman")
                                .surname("yay")
                                .email("os@os.com")
                                .age(50)
                                .buildWithoutDepartment();

    }
}
