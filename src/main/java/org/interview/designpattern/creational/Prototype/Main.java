package org.interview.designpattern.creational.Prototype;

public class Main {
    public static void main(String[] args) {
        Cat originalCat = new Cat("Tom", 2, "Brown");

        Cat newCat = originalCat.clone();
        System.out.println(
                "Original Cat: " + originalCat.getName() + ", " + originalCat.getAge() + ", " + originalCat.getColor());
        System.out.println(
                "New Cat: " + newCat.getName() + ", " + newCat.getAge() + ", " + newCat.getColor());
    }
}
