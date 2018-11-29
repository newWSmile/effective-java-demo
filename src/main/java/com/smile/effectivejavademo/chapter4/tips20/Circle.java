package com.smile.effectivejavademo.chapter4.tips20;

import java.util.Map;

/**
 * @author Smile(wangyajun)
 * @create 2018-11-28 9:10
 **/
public class Circle extends Figure2 {
    final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    double area() {
        return Math.PI*(radius*radius);
    }
}
