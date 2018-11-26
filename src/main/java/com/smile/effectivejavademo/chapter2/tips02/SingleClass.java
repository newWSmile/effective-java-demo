package com.smile.effectivejavademo.chapter2.tips02;

/**
 * @author Smile(wangyajun)
 * @create 2018-11-26 8:58
 **/
public class SingleClass {
    private static final SingleClass INSTANCE = new SingleClass();

    private SingleClass(){

    }

    public static SingleClass getInstance(){
        return INSTANCE;
    }

    private Object readResolve(){
        return INSTANCE;
    }


}
