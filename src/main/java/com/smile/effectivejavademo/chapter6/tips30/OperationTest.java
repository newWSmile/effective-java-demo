package com.smile.effectivejavademo.chapter6.tips30;

/**
 * @author Smile(wangyajun)
 * @create 2018-11-29 10:09
 **/
public class OperationTest {

    public static void main(String[] args) {
        double x = Double.parseDouble("102.31");
        double y = Double.parseDouble("22.3");

        for ( Operation operation :Operation.values()){
            System.out.printf("%f %s %f = %f%n",x ,operation,y,operation.apply(x,y));
        }


    }
}
