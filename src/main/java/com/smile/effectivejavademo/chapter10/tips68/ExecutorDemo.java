package com.smile.effectivejavademo.chapter10.tips68;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Smile(wangyajun)
 * @create 2018-11-30 15:27
 **/
public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorService executorService2 = Executors.newFixedThreadPool(16);



    }

}
