package com.training.softtech;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ImportResource("classpath:abc.xml")
public class MyConfig {

    @Bean
    @Qualifier("anakara")
    public MySpringBean myBean() {
        return new MySpringBean();
    }

}
