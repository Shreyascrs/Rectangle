package com.thoughtworks.com.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.thoughtworks.com.bootcamp.Rectangle.createRectangle;
import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    private static Rectangle rectangle;

    @BeforeAll
    static void init() {
        rectangle = createRectangle(1.0, 1.0);
    }

    @Test
    void ShouldCreateRectangleWithLengthOneAndBreadthOne_WhenAreaCalled_ThenReturnOne() {
        assertEquals(1.0,rectangle.area());
    }
}
