package com.thoughtworks.com.bootcamp;

public class Rectangle {
    float length;
    float breadth;

    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    float area()
    {
        return  length*breadth;
    }
}