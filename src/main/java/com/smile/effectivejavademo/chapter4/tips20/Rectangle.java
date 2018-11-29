package com.smile.effectivejavademo.chapter4.tips20;

/**
 * @author Smile(wangyajun)
 * @create 2018-11-28 9:11
 **/
public class Rectangle extends Figure2 {

    final double length;

    final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}
