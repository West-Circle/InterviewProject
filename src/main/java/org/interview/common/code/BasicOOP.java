package org.interview.common.code;

abstract class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }

    public abstract void sleep();

    // overload
    public void makeSound() {
        System.out.println("Animal is making sound");
    }
}

class Dog extends Animal {
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void makeSound(int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.println("Dog is making sound");
        }
    }

    public void makeSound(String barkType) {
        System.out.println("Dog is making " + barkType + " sound");
    }

}

abstract class Shape {
    // attribute
    String color;

    // constructor
    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void draw();
}

class Rectangle extends Shape {

    private int length;
    private int width;

    public Rectangle(int length, int width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class BasicOOP {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.makeSound();
        dog.makeSound("wangwang");
        dog.makeSound(5);
        System.out.println("########################################################");
        Rectangle rect = new Rectangle(10, 20, "red");
        rect.draw();
        System.out.println("length: " + rect.getLength() + " width: " + rect.getWidth() + " color: " + rect.getColor());
        System.out.println("########################################################");

    }
}
