package org.interview.designpattern.creational.Prototype;

public abstract class Animal implements Cloneable {
    private String name;
    private Integer age;
    private String color;

    public Animal(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // get method
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    // set method
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be positive");
        }
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
