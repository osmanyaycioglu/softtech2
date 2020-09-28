package com.softtech.java.training.lambda;

import java.math.BigDecimal;

public class LambdaRun {

    public static void main(final String[] args) {
        LambdaRun lbRuun = new LambdaRun();
        int a = 100;

        IExecute e = new ExecuteImpl();

        IExecute e2 = new IExecute() {

            @Override
            public String execute(final String strParam) {
                return "Hello " + strParam + " " + a;
            }
        };

        IExecute e25 = new IExecute() {

            @Override
            public String execute(final String strParam) {
                return "Hello " + strParam + " " + a;
            }
        };

        System.out.println(e.execute("osman"));
        System.out.println(e2.execute("osman"));

        IExecute e3 = z -> {
            return "Hello " + z + " " + a;
        };

        IExecute e4 = ra -> "Hello " + ra + " " + a;

        System.out.println(e3.execute("osman"));
        System.out.println(e4.execute("osman"));

        IPrint prt = (zeta,
                      b,
                      c,
                      d) -> System.out.println(b + zeta + c + d);

        IPrint pr2t = LambdaRun::notImportant;
        IPrint pr3t = lbRuun::moreNotImportantMethodName;

        pr2t.print(100,
                   "test ",
                   1.8D,
                   BigDecimal.ONE);

        prt.print(100,
                  "test ",
                  1.8D,
                  BigDecimal.ONE);
        pr3t.print(100,
                   "test ",
                   1.8D,
                   BigDecimal.ONE);


        ITrain trIntf = () -> "Hello world";

        IMethod mInft = s -> System.out.println(s);

        IMethod mInft2 = System.out::println;

    }

    public static void notImportant(final int intVal,
                                    final String strVal,
                                    final Double d,
                                    final BigDecimal bd) {
        System.out.println(strVal + intVal + d + bd);
    }

    public void moreNotImportantMethodName(final int intVal,
                                           final String strVal,
                                           final Double d,
                                           final BigDecimal bd) {
        System.out.println(strVal + intVal + d + bd);
    }

    public void abcv(final int intVal,
                     final Double d,
                     final BigDecimal bd) {
        System.out.println("" + intVal + d + bd);
    }

}
