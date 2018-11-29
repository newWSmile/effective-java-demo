package com.smile.effectivejavademo.chapter5.tips23;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Smile(wangyajun)
 * @create 2018-11-28 10:20
 **/
public class CollectionsDemo {
    public static void main(String[] args) {
        List<Date> dateList = new LinkedList<>();
        dateList.add(new Date());

        dateList.add(new java.sql.Date(System.currentTimeMillis()));

        dateList.forEach(item -> {
            System.out.println(item);
        });
    }

}
