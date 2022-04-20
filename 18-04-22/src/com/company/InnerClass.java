//package com.company;
//
//public class InnerClass {
//    public static void main(String[] args) {
//        new Outer().new Inner().method1(1000,2000);
//    }
//}
//class Outer{
//    private int a = 10;
//    private int b = 20;
//    class Inner{
//        int a = 100;
//        int b = 200;
//        void method1(int a,int b){
//            System.out.println("local : a is " + a + " and b is " + b);
//            System.out.println("Inner class : a is " + this.a + " and b is " + this.b);
//            System.out.println("Outer class : a is " + Outer.this.a + " and b is " + Outer.this.b);
//        }
//    }
//}
