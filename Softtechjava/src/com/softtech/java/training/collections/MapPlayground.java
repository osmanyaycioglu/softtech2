package com.softtech.java.training.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;

import com.softtech.java.training.pattern.builder.Employee;

public class MapPlayground {

    public static void main(final String[] args) {
        Map<String, Employee> employeeMap1 = new HashMap<>();
        Map<String, Employee> employeeMap2 = new Hashtable<>();
        Map<String, Employee> employeeMap3 = new ConcurrentHashMap<>(1_200_000,
                                                                     0.9F,
                                                                     1_200);
        Map<String, Employee> employeeMap4 = new TreeMap<>();

        Map<String, List<Employee>> employeeMap5 = new HashMap<>();


        employeeMap1.put("osman",
                         Employee.getBuilder()
                                 .name("osman")
                                 .surname("aya")
                                 .email("os@os.com")
                                 .buildFullObject());
        employeeMap1.put("ali",
                         Employee.getBuilder()
                                 .name("ali")
                                 .surname("veli")
                                 .email("os@os.com")
                                 .buildFullObject());

        Employee employeeLoc = employeeMap1.get("ali");

        employeeMap1.put("ali",
                         Employee.getBuilder()
                                 .name("aliv2")
                                 .surname("veliv2")
                                 .email("os@os.com")
                                 .buildFullObject());

        boolean containsKeyLoc = employeeMap1.containsKey("ali");
        Employee removeLoc = employeeMap1.remove("ali");
        employeeMap1.putIfAbsent("ali",
                                 Employee.getBuilder()
                                         .name("aliv2")
                                         .surname("veliv2")
                                         .email("os@os.com")
                                         .buildFullObject());


        Set<String> keySetLoc = employeeMap1.keySet();
        for (String stringLoc : keySetLoc) {
            Employee emp = employeeMap1.get(stringLoc);
        }

        Collection<Employee> valuesLoc = employeeMap1.values();
        for (Employee employee2Loc : valuesLoc) {

        }

        Set<Entry<String, Employee>> entrySetLoc = employeeMap1.entrySet();
        for (Entry<String, Employee> entryLoc : entrySetLoc) {
            String keyLoc = entryLoc.getKey();
            Employee valueLoc = entryLoc.getValue();
        }

        employeeMap1.forEach((k,
                              v) -> System.out.println("Key : " + k + " value : " + v));
        BiConsumer<String, Employee> bicon2 = (k,
                                               v) -> System.out.println("Key : " + k + " value : " + v);
        BiConsumer<String, Employee> bicon1 = new MapConsume();
        employeeMap1.forEach(bicon1);

    }
}
