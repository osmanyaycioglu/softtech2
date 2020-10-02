package com.training.softtech.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class MyCustomWriter implements ItemWriter<Integer> {

    @Override
    public void write(final List<? extends Integer> itemsParam) throws Exception {
        System.out.println(itemsParam);
    }

}
