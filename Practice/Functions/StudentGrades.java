package com.company.Functions;

import java.util.Scanner;

//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

/*      Marks        Grade
        91-100         AA
        81-90          AB
        71-80          BB
        61-70          BC
        51-60          CD
        41-50          DD
        <=40          Fail*/
public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks");
        int marks = input.nextInt();
        System.out.println("Your grade is " + grade(marks));
    }
    static String grade(int marks){
        if(marks<=100 && marks>90)
            return "AA";
        else if(marks>80)
            return "AB";
        else if(marks>70)
            return "BB";
        else if(marks>60)
            return "BC";
        else if(marks>50)
            return "CD";
        else if(marks>40)
            return "DD";
        else
            return "Fail";
    }
}
