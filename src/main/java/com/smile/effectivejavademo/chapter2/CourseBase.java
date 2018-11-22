/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: CourseBase
 * Author:   Administrator
 * Date:     2018\11\22 0022 22:47
 * Description: 课程主表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.smile.effectivejavademo.chapter2;

import javafx.util.Builder;

import java.util.Calendar;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈课程主表〉
 *
 * @author Administrator
 * @create 2018\11\22 0022
 * @since 1.0.0
 */
public class CourseBase {


    /**
     * id
     */
    private Long id;

    /**
     * 课程名称
     */
    private String name;

    /**
     * 课程描述
     */
    private String desc;

    /**
     * 发布时间
     */
    private Date publishTime;

    /**
     * 课程状态
     */
    private String courseStatus;


    /**
     * 课程类型
     */
    private String courseType;

    /**
     * 点赞数量
     */
    private Integer likeCount;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    public static class Builder implements javafx.util.Builder<CourseBase> {
        @Override
        public CourseBase build() {
            return new CourseBase(this);
        }
        //required parameters
        /**
         * 课程名称
         */
        private String name;

        /**
         * 课程描述
         */
        private String desc;

        /**
         * 发布时间
         */
        private Date publishTime;


        //Optional paramters


        /**
         * 课程状态
         */
        private String courseStatus = "enable";


        /**
         * 课程类型
         */
        private String courseType = "normal";

        /**
         * 点赞数量
         */
        private Integer likeCount = 0;

        /**
         * 创建时间
         */
        private Date createTime = Calendar.getInstance().getTime();

        /**
         * 更新时间
         */
        private Date updateTime = Calendar.getInstance().getTime();

        public Builder(String name, String desc, Date publishTime) {
            this.name = name;
            this.desc = desc;
            this.publishTime = publishTime;
        }

        public Builder courseStatus(String courseStatus) {
            this.courseStatus = courseStatus;
            return this;
        }

        public Builder courseType(String courseType) {
            this.courseType = courseType;
            return this;
        }

        public Builder likeCount(Integer likeCount) {
            this.likeCount = likeCount;
            return this;
        }

        public Builder createTime(Date createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder updateTime(Date updateTime) {
            this.updateTime = updateTime;
            return this;
        }
    }

    private CourseBase(Builder builder) {
        this.courseType = builder.courseType;
        this.desc = builder.desc;
        this.name = builder.name;
        this.courseStatus = builder.courseStatus;
        this.publishTime = builder.publishTime;
        this.likeCount = builder.likeCount;
        this.createTime = builder.createTime;
        this.updateTime = builder.updateTime;
    }

}