package com.smile.effectivejavademo.chapter8.tips47;

/**
 * @author Smile(wangyajun)
 * @create 2018-11-30 9:08
 **/
public class ForDemo {

    public static void main(String[] args) {


        for1();


        for2();

    }


    private static void for2() {
        for (int i = 0; i < 100; i++) {
            ForDemo demo = new ForDemo();
            //TODO something
        }
    }

    private static void for1() {
        ForDemo demo = null ;
        for (int i = 0; i < 100; i++) {
            demo = new ForDemo();
            //TODO something
        }

    }
}
