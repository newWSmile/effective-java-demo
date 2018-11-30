package com.smile.effectivejavademo.chapter8.tips47;

import java.util.Hashtable;
import java.util.Random;

/**
 * @author Smile(wangyajun)
 * @create 2018-11-29 17:56
 **/
public class RandDemo {
    private static final Random rand = new Random();

    public static void main(String[] args) {
        int n = 2 *(Integer.MAX_VALUE/3);
        int low = 0 ;
        for (int i = 0; i < 1000000; i++) {
            if (rand.nextInt(1000000) < n/2 ){
                low++;
            }
        }




        System.out.println(low);

    }




    static int random(int n ){
        return Math.abs(rand.nextInt()) % n ;
    }

}
