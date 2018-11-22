/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: CourseTestMain
 * Author:   Administrator
 * Date:     2018\11\22 0022 23:01
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.smile.effectivejavademo.chapter2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2018\11\22 0022
 * @since 1.0.0
 */
public class CourseTestMain {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CourseBase courseBase = new CourseBase.Builder("java入门到放弃","java is the best language",simpleDateFormat.parse("2018-11-25 22:00:00"))
                .courseStatus("enable")
                .likeCount(0)
                .courseType("normal")
                .build();


    }

}