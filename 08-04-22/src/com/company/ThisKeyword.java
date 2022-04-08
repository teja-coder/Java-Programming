package com.company;

//3. Write a program to give the example for 'this' operator. Also use the 'this' keyword as return statement

public class ThisKeyword {
    public static void main(String[] args) {
        Student s1 = new Student("210","Irfan","CSE",19);
        Student s2 = new Student();
        s2 = s1.setValue();
        s2.display();
    }
}

class Student {
    String rollNo,studentName,branch;
    int age;

    Student() {
        System.out.println("New Student created");
    }

    Student(String rollNo, String studentName, String branch, int age) {
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.branch = branch;
        this.age = age;
    }

    Student setValue() {
        return this;
    }

    void display() {
        System.out.println("Name : " + studentName);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Branch : " + branch);
        System.out.println("Age : " + age);
    }


}
