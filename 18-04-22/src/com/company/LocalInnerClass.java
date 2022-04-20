package com.company;

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.method1();
    }
}
class Outer {
    private int a = 100;
    void method1(){
        class Inner {
            void method2() {
                System.out.println("Inner method");
                System.out.println("a is " + a);
            }
        }
        Inner i = new Inner();
        i.method2();
    }
}
