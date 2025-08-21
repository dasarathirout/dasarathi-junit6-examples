package com.rout.dasarathi.ex21;

public class Rectangle {

    public double width;
    public double height;

    public Rectangle() {
        this(0,0);
    }
    public Rectangle(double width, double height) {
        this.width = Math.abs(width);
        this.height = Math.abs(height);
    }

    public double getArea() {
        return Math.abs(width) * Math.abs(height);
    }

    public double getPerimeter() {
        return 2 * (Math.abs(width) + Math.abs(height));
    }
}