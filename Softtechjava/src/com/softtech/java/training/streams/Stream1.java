package com.softtech.java.training.streams;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import com.softtech.java.training.pattern.builder.Employee;

public class Stream1 {

    public static void main(final String[] args) {
        List<String> strList = new ArrayList<>();
        SecureRandom randomLoc = new SecureRandom();
        for (int iLoc = 0; iLoc < 1_000; iLoc++) {
            strList.add("test" + randomLoc.nextInt());
        }
        strList.add("bozgun1818");
        strList.add("bozgun1818");
        strList.add("bozgun1818");
        strList.add("bozgun1818");

        //        for (String stringLoc : strList) {
        //            System.out.println(stringLoc);
        //        }
        //
        //        strList.forEach(s -> System.out.println("Thread Name :"
        //                                                + Thread.currentThread()
        //                                                        .getName()
        //                                                + " text : "
        //                                                + s));
        //        System.out.println("-----------------------------------");
        //        strList.stream()
        //               .parallel()
        //               .skip(10)
        //               .sorted()
        //               .forEach(s -> System.out.println("Thread Name :"
        //                                                + Thread.currentThread()
        //                                                        .getName()
        //                                                + " text : "
        //                                                + s));

        //        System.out.println("-----------------------------------");
        //        strList.parallelStream()
        //               .forEach(s -> System.out.println("Thread Name :"
        //                                                + Thread.currentThread()
        //                                                        .getName()
        //                                                + " text : "
        //                                                + s));
        //        System.out.println("-----------------------------------");
        //        strList.stream()
        //               .skip(10)
        //               .sorted()
        //               .filter(e -> e.length() < 13)
        //               .distinct()
        //               .limit(10)
        //               .forEach(s -> System.out.println(s));
        //
        //        System.out.println("-----------------------------------");
        //        boolean matchLoc = strList.stream()
        //                                  .skip(10)
        //                                  .sorted()
        //                                  .filter(e -> e.length() < 13)
        //                                  .anyMatch(o -> o.startsWith("test"));
        //
        //        System.out.print(matchLoc);
        List<Employee> empList = new ArrayList<>();
        AtomicInteger index = new AtomicInteger();
        Map<String, Employee> collectLoc = strList.stream()
                                                  .skip(10)
                                                  .sorted()
                                                  .filter(e -> e.length() < 14)
                                                  .distinct()
                                                  .limit(100)
                                                  .map(r -> Employee.getBuilder()
                                                                    .name(r)
                                                                    .surname("sur" + randomLoc.nextInt(1_000))
                                                                    .buildFullObject())
                                                  .peek(e -> empList.add(e))
                                                  .filter(f -> f.getSurname()
                                                                .length() < 7)
                                                  .sorted((o1,
                                                           o2) -> o1.getSurname()
                                                                    .compareTo(o2.getSurname()))
                                                  .map(e -> Integer.parseInt(e.getSurname()
                                                                              .substring(3)))
                                                  .sorted()
                                                  .filter(i -> i < 500)
                                                  .collect(Collectors.toMap(i -> "sur" + i,
                                                                            i -> empList.get(index.incrementAndGet())));

        IntSummaryStatistics summaryStatisticsLoc = strList.stream()
                                                           .skip(10)
                                                           .sorted()
                                                           .filter(e -> e.length() < 14)
                                                           .distinct()
                                                           .limit(100)
                                                           .map(r -> {
                                                               Employee emp = Employee.getBuilder()
                                                                                      .name(r)
                                                                                      .surname("sur"
                                                                                               + randomLoc.nextInt(1_000))
                                                                                      .buildFullObject();
                                                               empList.add(emp);
                                                               return emp;
                                                           })
                                                           .filter(f -> f.getSurname()
                                                                         .length() < 7)
                                                           .peek(u -> System.out.println(u))
                                                           .sorted((o1,
                                                                    o2) -> o1.getSurname()
                                                                             .compareTo(o2.getSurname()))
                                                           .mapToInt(e -> Integer.parseInt(e.getSurname()
                                                                                            .substring(3)))
                                                           .summaryStatistics();
        // .forEach(System.out::println);

        // .forEach(s -> System.out.println(s));


    }
}

