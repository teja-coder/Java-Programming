package com.company;

// 1. Write a program to create a room class, the attributes of this class is roomno, roomtype, roomarea, and ACmachine. In this class the member functions are setdata and display data

import java.util.Scanner;

public class RoomClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Room roomObj = new Room();
        System.out.print("Enter room no : ");
        int roomNo = in.nextInt();
        System.out.print("Enter room type : ");
        String roomType = in.next();
        System.out.print("Enter room area : ");
        double roomArea = in.nextDouble();
        System.out.print("Enter AC machine : ");
        String acMachine = in.next();
        roomObj.setData(roomNo,roomType,roomArea,acMachine);
        roomObj.displayData();
    }
}

class Room {
    int roomNo;
    String roomType, acMachine;
    double roomArea;

    void setData(int roomNo,String roomType,double roomArea,String acMachine) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.roomArea = roomArea;
        this.acMachine = acMachine;
    }

    void displayData() {
        System.out.println("Room No : " + roomNo);
        System.out.println("Room Type : " + roomType);
        System.out.println("Room Area : " + roomArea);
        System.out.println("AC Machine : " + acMachine);
    }
}
