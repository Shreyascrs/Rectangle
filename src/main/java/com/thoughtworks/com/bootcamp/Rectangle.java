package com.thoughtworks.com.bootcamp;

public class Rectangle {
    private double length;
    private double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    static Rectangle createSquare(double size) {
        return new Rectangle(size, size);
    }
    static Rectangle createRectangle(double length,double breadth){
        return  new Rectangle(length,breadth);
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }
}