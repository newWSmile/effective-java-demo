package com.smile.effectivejavademo.chapter5.tips27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Smile(wangyajun)
 * @create 2018-11-28 11:51
 **/
public class FuncitonTest {
    public static Set union(Set set1 ,Set set2){
        Set result = new HashSet(set1);
        result.addAll(set2);
        return result;
    }


    public static void main(String[] args) {
        Set guys = new HashSet(Arrays.asList("Tom","Dick","Harry"));
        Set stooges = new HashSet(Arrays.asList("Larry","Moe","Curly"));
        Set aflCio = union(guys,stooges);
        System.out.println(aflCio);
    }


}
