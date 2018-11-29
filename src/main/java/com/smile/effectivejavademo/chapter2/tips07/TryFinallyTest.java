package com.smile.effectivejavademo.chapter2.tips07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Smile(wangyajun)
 * @create 2018-11-26 11:33
 **/
public class TryFinallyTest {

    public static void main(String[] args) {
        FileInputStream inputStream = null ;
        try {
            inputStream = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (null != inputStream){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

}
