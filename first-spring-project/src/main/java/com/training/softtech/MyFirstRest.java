package com.training.softtech;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class MyFirstRest {

    @Autowired
    @Qualifier("anakara")
    private MySpringBean       msb;

    private final MySpringBean msb2;

    private MySpringBean       msb3;

    @Autowired
    private ICustomerDAO       cDao;

    //    public MyFirstRest() {
    //    }

    @Autowired
    public MyFirstRest(@Qualifier("anakara") final MySpringBean msbParam) {
        this.msb2 = msbParam;
        this.msb2.execute();
    }

    @PostConstruct
    public void name() {
        this.msb.execute();
    }

    @PreDestroy
    public void dest() {
        System.out.println("destroy");
    }


    @Autowired
    public void xyz(@Qualifier("anakara") final MySpringBean msbParam) {
        this.msb3 = msbParam;
    }


    @GetMapping("/prt")
    public String helloWorld() {
        return "Hello world";
    }

    @PostMapping("/prt")
    public String helloWorld2() {
        return "Hello world 2";
    }

    @DeleteMapping("/prt")
    public String helloWorld3() {
        return "Hello world 3";
    }

    @GetMapping("/prt5/{xyz}/{abc}")
    public String helloWorld5(@PathVariable("xyz") final String name,
                              @PathVariable("abc") final String surname) {
        return "Hello world 5 " + name + " " + surname;
    }

    @GetMapping("/prt6")
    public String helloWorld6(@RequestParam("xyz") final String name,
                              @RequestParam("abc") final String surname) {
        return "Hello world 6 " + name + " " + surname;
    }

    @PostMapping("/prt7")
    public String helloWorld7(@RequestBody final Customer customer) {
        this.cDao.save(customer);
        return "Hello world 7 " + customer.getName() + " " + customer.getSurname() + " " + customer.getAge();
    }


    @PostMapping("/prt8")
    public Customer helloWorld8(@RequestBody @Validated final Customer customer) {
        customer.setName("ali");
        return customer;
    }

}
