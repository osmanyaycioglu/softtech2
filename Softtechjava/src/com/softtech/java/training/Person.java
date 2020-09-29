package com.softtech.java.training;

public class Person implements Comparable<Person> {

    private String name;
    private String surname;
    private String email;
    private String department;
    private int    age;


    public Person(final String nameParam,
                  final String surnameParam,
                  final String emailParam,
                  final String departmentParam,
                  final int ageParam) {
        super();
        this.name = nameParam;
        this.surname = surnameParam;
        this.email = emailParam;
        this.department = departmentParam;
        this.age = ageParam;
    }

    public Person(final String nameParam,
                  final String surnameParam,
                  final String emailParam,
                  final int ageParam) {
        super();
        this.name = nameParam;
        this.surname = surnameParam;
        this.email = emailParam;
        this.age = ageParam;
    }

    public Person(final String nameParam,
                  final String surnameParam,
                  final int ageParam,
                  final String departmentParam) {
        super();
        this.name = nameParam;
        this.surname = surnameParam;
        this.age = ageParam;
        this.department = departmentParam;
    }

    public Person(final String nameParam,
                  final String surnameParam) {
        super();
        this.name = nameParam;
        this.surname = surnameParam;
    }

    public Person() {
    }

    public static Person createFullPersonObject(final String nameParam,
                                                final String surnameParam,
                                                final String emailParam,
                                                final String departmentParam,
                                                final int ageParam) {
        Person person = new Person();

        person.name = nameParam;
        person.surname = surnameParam;
        person.email = emailParam;
        person.department = departmentParam;
        person.age = ageParam;

        return person;
    }

    public static Person createPersonObjectWithoutEmail(final String nameParam,
                                                        final String surnameParam,
                                                        final String departmentParam,
                                                        final int ageParam) {
        Person person = new Person();

        person.name = nameParam;
        person.surname = surnameParam;
        person.department = departmentParam;
        person.age = ageParam;

        return person;
    }

    public static Person createPersonObjectWithoutDepartment(final String nameParam,
                                                             final String surnameParam,
                                                             final String emailParam,
                                                             final int ageParam) {
        Person person = new Person();

        person.name = nameParam;
        person.surname = surnameParam;
        person.email = emailParam;
        person.age = ageParam;

        return person;
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

    @Override
    public int compareTo(final Person oParam) {
        return this.name.compareTo(oParam.getName());
    }


}
