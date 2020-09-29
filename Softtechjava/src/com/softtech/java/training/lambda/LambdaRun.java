package com.softtech.java.training.lambda;

import java.math.BigDecimal;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.softtech.java.training.Person;

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

        Function<String, Integer> func1 = o -> Integer.parseInt(o);
        Function<String, Long> func2 = o -> Long.parseLong(o);
        Function<Person, String> func3 = o -> o.getName() + " " + o.getSurname();

        BiFunction<String, String, Integer> bifunc1 = (l,
                                                       k) -> Integer.parseInt(l) + Integer.parseInt(k);
        Integer applyLoc = bifunc1.apply("100",
                                         "200");
        System.out.println("Sonuç : " + applyLoc);

        Consumer<String> strConsumer = q -> System.out.println(q);
        BiConsumer<String, Integer> strIntBiConsumerLoc = (u,
                                                           y) -> System.out.println(u + y);
        strIntBiConsumerLoc.accept("Test ",
                                   500);
        Supplier<String> strSupplierLoc = () -> "Hello World";
        System.out.println(strSupplierLoc.get());

        Predicate<String> strPredicateLoc = k1 -> k1.startsWith("osman");

        System.out.println(strPredicateLoc.test("osman yaycıoğlu"));

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
