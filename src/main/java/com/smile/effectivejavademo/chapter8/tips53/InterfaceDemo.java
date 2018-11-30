package com.smile.effectivejavademo.chapter8.tips53;

import java.util.Arrays;
import java.util.Set;

/**
 * @author Smile(wangyajun)
 * @create 2018-11-30 10:35
 **/
public class InterfaceDemo {

    public static void main(String[] args) {
        args = new String[]{"Set","smile","test"};

        Class<?> c1 = null ;

        try {
            c1=Class.forName(args[0]);
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found");

            System.exit(1);
        }

        Set<String> s = null ;
        try {
            s = (Set<String>) c1.newInstance();
        } catch (InstantiationException e) {
            System.err.println("Class not instantiable");

            System.exit(1);
        } catch (IllegalAccessException e) {
            System.err.println("Class can not accessible");

            System.exit(1);
        }

        s.addAll(Arrays.asList(args).subList(1,args.length));
        System.out.println(s);

    }

}
