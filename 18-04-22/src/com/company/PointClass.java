package com.company;

//2. Create class point with following instance variables and methods.
//Instance variable : private int x,y Constructors : public Point(), Point(int x,int y).
//Methods : public void setX(int x), setY(int y), setXY(int x,int y) and also find the distance between the points.

public class PointClass {
    public static void main(String[] args) {
        Point p = new Point();
        p.distance();
    }
}
class Point {
    private int x,y;
    public Point() {

    }

    Point(int x,int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x,int y) {
        this.x = x;
        this.y = y;
    }
    void distance() {
        Point p1 = new Point(2,3);
        Point p2 = new Point();
        p2.setX(2);
        p2.setY(0);
        Point p3 = new Point();
        p3.setXY(1,1);
        double d1 = Math.sqrt(((p1.x-p2.x)*(p1.x-p2.x)) + ((p1.y-p2.y)*(p1.y-p2.y)));
        double d2 = Math.sqrt(((p2.x-p3.x)*(p2.x-p3.x)) + ((p2.y-p3.y)*(p2.y-p3.y)));
        double d3 = Math.sqrt(((p3.x-p1.x)*(p3.x-p1.x)) + ((p3.y-p1.y)*(p3.y-p1.y)));
        display(p1,p2,p3,d1,d2,d3);
    }
    void display(Point p1,Point p2,Point p3,double d1,double d2,double d3){
        System.out.println("The distance between (" +  p1.x + "," + p1.y + ")" + " and (" +  p2.x + "," + p2.y + ")"  + " is " + d1);
        System.out.println("The distance between (" +  p2.x + "," + p2.y + ")" + " and (" +  p3.x + "," + p3.y + ")"  + " is " + d2);
        System.out.println("The distance between (" +  p1.x + "," + p1.y + ")" + " and (" +  p3.x + "," + p3.y + ")"  + " is " + d3);
    }
}