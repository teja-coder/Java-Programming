package com.company;

import java.util.Scanner;

public class StudentObjects {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student s1 = new Student();
        System.out.println("Enter name,rollno,age");
        s1.setName(in.next());
        s1.setRollNo(in.next());
        s1.setAge(in.nextInt());
        s1.getName();
        s1.getRollNo();
        s1.getAge();
    }
}

class Student {
    String name,rollNo;
    int age;
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    String getName() {
        return name;
    }

    String getRollNo() {
        return rollNo;
    }

    void getAge() {
        System.out.println("Age is " + age);
    }
}
