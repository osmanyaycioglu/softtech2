package com.softtech.java.training.pattern.builder;


public class Employee {

    private String name;
    private String surname;
    private String email;
    private String department;
    private int    age;

    private Employee() {
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getEmail() {
        return this.email;
    }

    public String getDepartment() {
        return this.department;
    }

    public int getAge() {
        return this.age;
    }


    public void setEmail(final String emailParam) {
        this.email = emailParam;
    }

    public static EmployeeBuilder getBuilder() {
        return new EmployeeBuilder();
    }

    public static class EmployeeBuilder {

        private final Employee employee = new Employee();

        private EmployeeBuilder() {
        }

        public EmployeeBuilder name(final String nameParam) {
            this.employee.name = nameParam;
            return this;
        }

        public EmployeeBuilder surname(final String surnameParam) {
            this.employee.surname = surnameParam;
            return this;
        }

        public EmployeeBuilder email(final String emailParam) {
            this.employee.email = emailParam;
            return this;
        }

        public EmployeeBuilder department(final String departmentParam) {
            this.employee.department = departmentParam;
            return this;
        }

        public EmployeeBuilder age(final int ageParam) {
            this.employee.age = ageParam;
            return this;
        }

        public Employee buildFullObject() {
            // Validation
            return this.employee;
        }

        public Employee buildWithoutDepartment() {
            // Validation
            this.employee.department = null;
            return this.employee;
        }

    }

}
