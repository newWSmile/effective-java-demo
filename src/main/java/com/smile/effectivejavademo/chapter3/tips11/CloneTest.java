package com.smile.effectivejavademo.chapter3.tips11;

/**
 * @author Smile(wangyajun)
 * @create 2018-11-26 15:18
 **/
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        StackClone stack = new StackClone();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        StackClone stackClone = stack.clone();
        stackClone.pop();
        stackClone.push(4);
        stackClone.push(5);


        System.out.println(stack);
        System.out.println("============================================");
        System.out.println(stackClone);



    }

}
