package com.ashok.lmbda.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList();
        employeeList.add(new Employee("a"));
        employeeList.add(new Employee("ram"));
        employeeList.sort((e1, e2) -> Integer.compare(e2.name.length(), e1.name.length()));
        System.out.println(employeeList);
        String[] s = new String[]{"ashok", "ram", "mohan"};
        Arrays.sort(s, String::compareToIgnoreCase);
        employeeList.forEach(System.out::println);
    }

}

class Employee {
    public String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
