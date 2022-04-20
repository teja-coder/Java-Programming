package com.company;

// 6. Demonstration of Nested classes and Inner classes

public class NestedClass {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass();
        nestedObj.display();
    }
}
class OuterClass {
    static int outer_x = 10;
    int outer_y = 20;
    private static int outer_private = 30;
    static class StaticNestedClass {
        void display() {
            System.out.println("Outer_x = " + outer_x);
            System.out.println("Outer_private = " + outer_private);
//            System.out.println("Outer_y = " + outer_y);   cannot access non-static members of outer class
        }
    }
}