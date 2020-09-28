package com.softtech.java.training.pattern.chain;


public abstract class AbstractCheckInteger implements ICheckInteger {

    private final AbstractCheckInteger nextCheckInteger;

    public AbstractCheckInteger(final AbstractCheckInteger nextCheckIntegerParam) {
        super();
        this.nextCheckInteger = nextCheckIntegerParam;
    }

    public void processCheck(final int a) {
        if (!this.check(a)) {
            if (this.nextCheckInteger == null) {
                System.out.println("Değer işlenmedi");
                return;
            }
            this.nextCheckInteger.processCheck(a);
        }
    }
}
