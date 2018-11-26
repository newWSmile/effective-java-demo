package com.smile.effectivejavademo.chapter2.tips02;

/**
 * @author Smile(wangyajun)
 * @create 2018-11-26 9:01
 * @Descripe : 创建enum时，编译器会自动为我们生成一个继承自java.lang.Enum的类
 **/
public enum SingleEnumClass {
    INSTANCE;


    private SingleEnumResource instance;
    SingleEnumClass() {
        instance = new SingleEnumResource();
    }
    public SingleEnumResource getInstance() {
        return instance;
    }

}
