package com.smile.effectivejavademo.chapter2.tips04;

/**
 * @author Smile(wangyajun)
 * @create 2018-11-26 9:36
 **/
public class UtilsClass {

    //Suppress default constructor for noninstantiability( 非实例化的)
    private UtilsClass(){
        throw  new AssertionError();
    }
}
