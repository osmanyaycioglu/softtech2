package com.softtech.java.training.enums;

import java.util.concurrent.TimeUnit;

public class ConvertEnumRun {

    public static void main(final String[] args) {
        System.out.println("Milis : " + EConvertToMillis.DAY.convert(3));

        System.out.println("SECOND : "
                           + TimeUnit.HOURS.convert(3,
                                                    TimeUnit.SECONDS));
    }
}
