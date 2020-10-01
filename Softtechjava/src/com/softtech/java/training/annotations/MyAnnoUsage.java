package com.softtech.java.training.annotations;

import com.softtech.java.training.Person;
import com.softtech.java.training.pattern.builder.Employee;

@MyFirstAnno(valStr = "osman", prt = 100)
public class MyAnnoUsage {

    @MyFirstAnno(valStr = "field", prt = 10)
    private Person person;


    @MyFirstAnno(valStr = "method")
    public Person getPerson() {
        return this.person;
    }


    @MyFirstAnno("asjkdh")
    public void setPerson(final Person personParam) {
        this.person = personParam;
    }


    public void xyz(final String str,
                    final int intVal,
                    final Person per,
                    final Employee emp) {

    }
}
