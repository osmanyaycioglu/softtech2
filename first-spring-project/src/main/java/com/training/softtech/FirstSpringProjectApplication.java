package com.training.softtech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringProjectApplication implements ApplicationRunner {

    @Autowired
    private ApplicationContext ap;

    @Autowired
    private MyConfig           config;

    public static void main(final String[] args) {
        SpringApplication.run(FirstSpringProjectApplication.class,
                              args);
    }

    @Override
    public void run(final ApplicationArguments argsParam) throws Exception {
        MyConfig beanLoc = this.ap.getBean(MyConfig.class);
        MyConfig beanLoc2 = (MyConfig) this.ap.getBean("myConfig");

    }

}
