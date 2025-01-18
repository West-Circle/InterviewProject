package org.interview.designpattern.structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String dept;
    private double salary;
    private List<Employee> subordinates;

    // constructor
    public Employee(String name, String dept, double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    // add
    public void add(Employee e) {
        subordinates.add(e);
    }

    // remove
    public void remove(Employee e) {
        subordinates.remove(e);
    }

    // get subordinates
    public List<Employee> getSubordinates() {
        return subordinates;
    }

    // tostring
    @Override
    public String toString() {
        return "Employee :[ Name : "
                + name + ", dept : "
                + dept + ", salary : "
                + salary + " , subordinates : "
                + subordinates + "]" + "\n";
    }
}
