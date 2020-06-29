package com.company;

import java.util.ArrayList;

public class Main3 {

    public static void main(String[] args) {
        Employee employee = new Employee("Employ");
        Manager manager = new Manager("Manag");

        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(employee);
        employeeList.add(manager);

        DetailsPrinter printer = new DetailsPrinter(employeeList);
        printer.printDetails();
    }
}
