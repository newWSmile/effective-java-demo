package com.smile.effectivejavademo.chapter4.tips20;

/**
 * @author Smile(wangyajun)
 * @create 2018-11-28 9:02
 **/
public class Figure {

    enum Shape {
        RECTANGLE,
        CIRCLE
    }


    final Shape shape;
    double length;
    double width;
    double radius;

    public Figure(double radius,Shape shape) {
        this.radius = radius;
        this.shape = shape;
    }

    public Figure(double length, double width,Shape shape) {
        this.length = length;
        this.width = width;
        this.shape = shape;
    }

    double area() {
        switch (shape) {
            case RECTANGLE:
                return length * width;
            case CIRCLE:
                return Math.PI * (radius * radius);
            default:
                throw new AssertionError();
        }
    }
}

