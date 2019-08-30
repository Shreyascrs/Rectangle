package com.thoughtworks.com.bootcamp;

import org.junit.jupiter.api.Assertions;

public class RectangleTest {
    void ToCalculateAreaOfRectangleAsLengthZeroAndBreadthZero_WhenArea_ThenReturnZero()
    {
        float length;
        float breadth;
        Rectangle rectangle=new Rectangle(length,breadth);
        Assertions.assertEquals(0.0f,rectangle.area());
    }
}