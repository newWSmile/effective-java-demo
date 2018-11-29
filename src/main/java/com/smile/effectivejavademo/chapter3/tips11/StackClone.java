package com.smile.effectivejavademo.chapter3.tips11;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * @author Smile(wangyajun)
 * @create 2018-11-26 15:19
 **/
public class StackClone implements Cloneable{
    private Object[] elements;

    private int size = 0;

    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public StackClone() {
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


    @Override
    protected StackClone clone() throws CloneNotSupportedException {
        StackClone stackClone = (StackClone) super.clone();
        stackClone.elements = elements.clone();
        return  stackClone;
    }

//    @Override
//    protected StackClone clone() throws CloneNotSupportedException {
//        StackClone stackClone = (StackClone) super.clone();
//
//        stackClone.elements = new Object[elements.length];
//        for (int i = elements.length;i-->0 ;) {
//            stackClone.elements[i] = (elements!=null) ? (Object) elements[i].clone() : null ;
//        }
//        return  stackClone;
//    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StackClone that = (StackClone) o;
        return size == that.size &&
                Arrays.equals(elements, that.elements);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(elements);
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", StackClone.class.getSimpleName() + "[", "]")
                .add("elements=" + Arrays.toString(elements))
                .add("size=" + size)
                .toString();
    }
}
