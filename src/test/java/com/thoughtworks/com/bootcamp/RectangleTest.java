package com.thoughtworks.com.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    void ToCalculateAreaOfRectangleAsLengthZeroAndBreadthZero_WhenArea_ThenReturnZero() {
        float length = 0.0f;
        float breadth = 0.0f;
        Rectangle rectangle = new Rectangle(length, breadth);
        assertEquals(0.0f, rectangle.area());
    }

    @Test
    void ToCalculateAreaOfRectangleAsOneOfItsValueMustBeZero_WhenAreaCalculated_ThenReturnZero() {
        float length = 0.0f;
        float breadth = 1.0f;
        Rectangle rectangle1 = new Rectangle(length, breadth);
        assertEquals(0.0f, rectangle1.area());
    }

    @Test
    void ToCalculateAreaOfRectangleAsOneOfItsValueMustBeOne_WhenAreaCalculated_ThenReturnOne() {
        float length = 1.0f;
        float breadth = 1.0f;
        Rectangle rectangle2 = new Rectangle(length, breadth);
        assertEquals(1.0f, rectangle2.area());
    }

    @Test
    void ToCalculatePerimeterOfRectangleAsBothLengthAndBreadthAsZero_WhenPerameterCalulated_ThenReturnZero() {
        float zero = 0.0f;
        Rectangle rectangle3 = new Rectangle(zero, zero);
        assertEquals(2.0f, rectangle3.perimeter());
    }

    @Test
    void ToCalculatePerimeterOfRectangleAsBothLengthAndBreadthAsOne_WhenPerameterCalulated_ThenReturnZero() {
        float one = 1.0f;
        Rectangle rectangle = new Rectangle(one, one);
        assertEquals(4.0f, rectangle.perimeter());
    }
}
