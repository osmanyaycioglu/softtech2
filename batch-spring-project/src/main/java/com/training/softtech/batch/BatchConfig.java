package com.training.softtech.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class BatchConfig {


    @Autowired
    private JobBuilderFactory  jbf;

    @Autowired
    private StepBuilderFactory sbf;

    @Autowired
    private JobLauncher        jl;

    @Scheduled(fixedDelay = 300_000, initialDelay = 1_000)
    public void startJob() {
        try {
            this.jl.run(this.job(),
                        new JobParametersBuilder().toJobParameters());
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }

    @Bean
    public ItemReader<String> read() {
        return new MyCustomReader();
    }

    @Bean
    public ItemProcessor<String, Integer> processor() {
        return new MyCustomProcessor();
    }

    @Bean
    public ItemWriter<Integer> writer() {
        return new MyCustomWriter();
    }

    @Bean
    public Step step1() {
        return this.sbf.get("cstep")
                       .<String, Integer> chunk(100)
                       .reader(this.read())
                       .processor(this.processor())
                       .writer(this.writer())
                       .build();
    }

    public Job job() {
        return this.jbf.get("myJob")
                       .start(this.step1())
                       .build();
    }

}

