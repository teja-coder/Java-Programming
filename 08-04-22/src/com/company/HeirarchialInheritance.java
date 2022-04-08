package com.company;

// 9. Write a program to demonstrate multilevel Inheritance

public class HeirarchialInheritance {
    public static void main(String[] args) {
        Boy b1 = new Boy();
        Girl g1 = new Girl();
    }
}

class Parent {
    Parent() {
        System.out.println("Parents love children");
    }
}

class Boy extends Parent {
    Boy() {
        System.out.println("Mama's boy");
    }
}

class Girl extends Parent {
    Girl() {
        System.out.println("Daddy's girl");
    }
}
