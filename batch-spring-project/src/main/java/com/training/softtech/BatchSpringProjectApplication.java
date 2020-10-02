package com.training.softtech;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class BatchSpringProjectApplication {

    public static void main(final String[] args) {
        SpringApplication.run(BatchSpringProjectApplication.class,
                              args);
    }

}
