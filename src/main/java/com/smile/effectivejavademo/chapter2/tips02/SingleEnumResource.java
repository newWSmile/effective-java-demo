package com.smile.effectivejavademo.chapter2.tips02;

/**
 * @author Smile(wangyajun)
 * @create 2018-11-26 9:05
 **/
public class SingleEnumResource {
    private String name ;

    private Integer age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SingleEnumResource{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
