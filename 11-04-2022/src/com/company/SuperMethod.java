package com.company;

public class SuperMethod {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.displayMethods();
    }
}

class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dog eats pedigree");
    }
    void bark(){
        System.out.println("Dog barks");
    }
    void displayMethods() {
        super.eat();
        eat();
        bark();
    }
}