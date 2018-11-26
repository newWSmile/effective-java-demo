package com.smile.effectivejavademo.chapter2.tips02;

/**
 * @author Smile(wangyajun)
 * @create 2018-11-26 9:06
 **/
public class SingleEnumClassTest {
    public static void main(String[] args) {
        SingleEnumResource resource = SingleEnumClass.INSTANCE.getInstance();

        SingleEnumResource resource2 = SingleEnumClass.INSTANCE.getInstance();

        resource.setAge(24);
        resource.setName("smile");
        System.out.println(resource.toString());

        System.out.println(resource.hashCode() == resource2.hashCode());
    }
}
