package org.interview.designpattern.creational.Prototype;

public class Cat extends Animal {
    public Cat(String name, Integer age, String color) {
        super(name, age, color);
    }

    @Override
    public Cat clone() {
        try {
            Cat cat = (Cat) super.clone();
            cat.setName("Copy of " + super.getName());
            cat.setAge(super.getAge() + 1);
            cat.setColor(super.getColor() + " (Copy)");
            return cat;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
