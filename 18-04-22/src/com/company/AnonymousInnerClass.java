package com.company;

public class AnonymousInnerClass {
    A a  = new A() {
        void m1() {
            System.out.println("m1 method");
        }
        void m2()  {
            System.out.println("m2 method");
        }
    };
    public static void main(String[] args) {
        AnonymousInnerClass t = new AnonymousInnerClass();
        t.a.m1();
        t.a.m2();
    }
}
class A {
    void m1() {}
    void m2() {}
}
