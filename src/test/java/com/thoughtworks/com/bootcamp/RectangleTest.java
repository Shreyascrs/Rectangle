package com.thoughtworks.com.bootcamp;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {


    @Test
    void ToCalculateAreaOfRectangleAsLengthZeroAndBreadthZero_WhenArea_ThenReturnZero() {
        double length = 0.0;
        double breadth = 0.0;
        Rectangle rectangle = new Rectangle(length, breadth);
        assertEquals(0.0, rectangle.area());
    }

    @Test
    void ToCalculateAreaOfRectangleAsOneOfItsValueMustBeZero_WhenAreaCalculated_ThenReturnZero() {
        double length = 1.0;
        double breadth = 1.0;
        Rectangle rectangle = new Rectangle(length, breadth);
        assertEquals(1.0, rectangle.area());
    }

    @Test
    void ToCalculateAreaOfRectangleAsOneOfItsValueMustBeOne_WhenAreaCalculated_ThenReturnOne() {
        double length = 1.0;
        double breadth = 1.0;
        Rectangle rectangle = new Rectangle(length, breadth);
        assertEquals(1.0, rectangle.area());
    }

    @Test
    void ToCalculatePerimeterOfRectangleAsBothLengthAndBreadthAsZero_WhenPerameterCalulated_ThenReturnZero() {
        double zero = 0.0;
        Rectangle rectangle = new Rectangle(zero, zero);
        assertEquals(0.0, rectangle.perimeter());
    }

    @Test
    void ToCalculatePerimeterOfRectangleAsBothLengthAndBreadthAsOne_WhenPerameterCalulated_ThenReturnZero() {
        double one = 1.0;
        Rectangle rectangle = new Rectangle(one, one);
        assertEquals(4.0, rectangle.perimeter());
    }
}
