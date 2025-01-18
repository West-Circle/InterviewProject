package org.interview.designpattern.structural.Composite;

public class Main {
    public static void main(String[] args) {
        Employee CEO = new Employee("Peter", "CEO", 30000);
        Employee headSales = new Employee("John", "Sales", 20000);
        Employee headIT = new Employee("Mike", "IT", 20000);
        Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);
        Employee itExecute1 = new Employee("Michael", "IT", 10000);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);
        headIT.add(itExecute1);

        CEO.add(headSales);
        CEO.add(headIT);

        System.out.println(CEO);
        for (Employee employee : CEO.getSubordinates()) {
            System.out.println(employee);
            for (Employee employee1 : employee.getSubordinates())
                System.out.println(employee1);
        }
    }
}
