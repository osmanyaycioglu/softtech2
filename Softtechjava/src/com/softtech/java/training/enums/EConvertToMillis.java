package com.softtech.java.training.enums;

public enum EConvertToMillis {

    DAY {

        @Override
        public long convert(final long valParam) {
            return HOUR.convert(valParam * 24);
        }
    },
    HOUR {

        @Override
        public long convert(final long valParam) {
            return MINUTE.convert(valParam * 60);
        }
    },
    MINUTE {

        @Override
        public long convert(final long valParam) {
            return SECOND.convert(valParam * 60);
        }
    },
    SECOND {

        @Override
        public long convert(final long valParam) {
            return valParam * 1_000;
        }
    },
    MILIS;

    public long convert(final long val) {
        throw new IllegalStateException("Method yok");
    }

}
