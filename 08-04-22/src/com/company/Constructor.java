package com.company;

// 2. Write a program create a class 'simpleobject'. Using constructor display the message

public class Constructor {
    public static void main(String[] args) {
        SimpleObject obj = new SimpleObject();
    }
}

class SimpleObject {
    SimpleObject() {
        System.out.println("This is SimpleObject class");
    }
}
