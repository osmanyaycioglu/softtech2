package com.training.softtech.batch;

import org.springframework.batch.item.ItemProcessor;

public class MyCustomProcessor implements ItemProcessor<String, Integer> {

    int counter = 0;

    @Override
    public Integer process(final String itemParam) throws Exception {
        System.out.println("Process : " + ++this.counter);
        return Integer.parseInt(itemParam);
    }

}
