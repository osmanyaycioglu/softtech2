package com.training.softtech.batch;

import java.util.Random;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class MyCustomReader implements ItemReader<String> {

    private int count = 0;

    @Override
    public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        this.count++;
        System.out.println("Read " + this.count);
        if (this.count > 1000) {
            return null;
        }
        return "" + new Random().nextInt();
    }

}
