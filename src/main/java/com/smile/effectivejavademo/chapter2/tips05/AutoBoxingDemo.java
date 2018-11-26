package com.smile.effectivejavademo.chapter2.tips05;

/**
 * @author Smile(wangyajun)
 * @create 2018-11-26 9:46
 **/
public class AutoBoxingDemo {
    public static void main(String[] args) {
        long sum = 0L;
//        Long sum = 0L;
        long start = System.currentTimeMillis();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println(end - start); //Long : 7085ms  long :938ms
        System.out.println((end - start)/1000.0);//Long :7.085s long :0.938s
        

    }
}
