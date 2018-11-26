package com.smile.effectivejavademo.chapter2.tips06;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @author Smile(wangyajun)
 * @create 2018-11-26 9:54
 **/
public class Stack {
    private Object[] elements;

    private int size = 0;

    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object object) {
        ensureCapacity();
        elements[size++] = object;
    }



    public Object pop(){ //这个pop方法会有问题，内存不会被回收
        if (size == 0){
            throw new EmptyStackException();
        }
        return elements[--size];

    }

    public Object newPop(){//改进版
        if (size == 0){
            throw new EmptyStackException();
        }
        Object result = elements[--size];
        elements[size] = null ; //清除过期引用
        return result;

    }

    /**
     * 如果数组大小不够了 就做一次扩大处理
     */
    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

}
