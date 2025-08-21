package com.rout.dasarathi.ex21;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Rectangle1Test {

    @Test
    void testDefaultConstructor() {
        Rectangle rectangle = new Rectangle();
        assertEquals(0.0, rectangle.width);
        assertEquals(0.0, rectangle.height);
    }

    @Test
    void testParameterizedConstructor() {
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        assertEquals(5.0, rectangle.width);
        assertEquals(10.0, rectangle.height);
    }

    @Test
    void testParameterizedConstructorNegative() {
        Rectangle rectangle = new Rectangle(-5.0, -10.0);
        assertEquals(5.0, rectangle.width);
        assertEquals(10.0, rectangle.height);
    }

    @Test
    void testGetArea() {
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        assertEquals(50.0, rectangle.getArea(), 0.01);
    }

    @Test
    void testGetAreaZero() {
        Rectangle rectangle = new Rectangle(0.0, 10.0);
        assertEquals(0.0, rectangle.getArea(), 0.01);
    }

    @Test
    void testGetPerimeter() {
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        assertEquals(30.0, rectangle.getPerimeter(), 0.01);
    }

    @Test
    void testGetPerimeterZero() {
        Rectangle rectangle = new Rectangle(0.0, 10.0);
        assertEquals(20.0, rectangle.getPerimeter(), 0.01);
    }

    @Test
    void testGetAreaNegativeWidth() {
        Rectangle rectangle = new Rectangle(-5.0, 10.0);
        assertEquals(50.0, rectangle.getArea(), 0.01);
    }

    @Test
    void testGetAreaNegativeHeight() {
        Rectangle rectangle = new Rectangle(5.0, -10.0);
        assertEquals(50.0, rectangle.getArea(), 0.01);
    }

    @Test
    void testGetPerimeterNegativeWidth() {
        Rectangle rectangle = new Rectangle(-5.0, 10.0);
        assertEquals(30.0, rectangle.getPerimeter(), 0.01);
    }

    @Test
    void testGetPerimeterNegativeHeight() {
        Rectangle rectangle = new Rectangle(5.0, -10.0);
        assertEquals(30.0, rectangle.getPerimeter(), 0.01);
    }
}
