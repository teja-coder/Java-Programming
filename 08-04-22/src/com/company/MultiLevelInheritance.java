package com.company;

// 10. Write a program to demonstrate multilevel inheritance

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Tiger t1 = new Tiger();
    }
}

class Animal {
    Animal() {
        System.out.println("Animal class");
    }
}

class WildAnimal extends Animal {
    WildAnimal() {
        System.out.println("Wild Animal class");
    }
}

class Tiger extends WildAnimal {
    Tiger() {
        System.out.println("Tiger class");
    }
}