package com.company;

//8. Create class named as 'a' and create a sub class 'b' which is extends from class 'a'. And use these classes in 'Inherit' class

public class Inheritance {
    public static void main(String[] args) {
        Inherit obj = new Inherit();
        obj.objA.display();
        obj.objB.display();
    }
}
class Inherit {
    Inherit() {
        System.out.println("This is inherit class");
    }
    A objA = new A();
    B objB = new B();
}

class A {
    A() {
        System.out.println("This is class A");
    }
    public void display() {
        System.out.println("Class A is a super class");
    }
}
class B extends A {
    B() {
        System.out.println("This is class B");
    }
    public void display() {
        System.out.println("Class B is inherited from class A");
    }
}