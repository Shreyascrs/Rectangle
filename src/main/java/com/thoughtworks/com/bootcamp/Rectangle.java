package com.thoughtworks.com.bootcamp;

public class Rectangle {
    private final float length;
    private final float breadth;

    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    float area() {
        return length * breadth;
    }

    public float perimeter() {
        return 2 * (length + breadth);
    }
}