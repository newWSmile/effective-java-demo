package com.smile.effectivejavademo.chapter3.tips08;

import java.util.*;

/**
 * @author Smile(wangyajun)
 * @create 2018-11-26 14:29
 **/
public class Tips08 implements Comparable<Tips08> , Comparator<Tips08> {
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

    public Tips08(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    //不能覆盖父类的equals 参数不对
//    @Override
//    public boolean equals(Tips08 obj) {
//        return super.equals(obj);
//    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tips08)) return false;
        Tips08 tips08 = (Tips08) o;
        return Objects.equals(name, tips08.name) &&
                Objects.equals(age, tips08.age);
    }

    //新版的好像是这么写的？
    //用Objects来做判断和hash值
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", Tips08.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("age=" + age)
                .toString();
    }



    public static void main(String[] args) {
        Map<Tips08,String> map = new HashMap<>();
        map.put(new Tips08("smile",24),"smile");
        String smile = map.get(new Tips08("smile", 24));
        System.out.println(smile);

        Tips08 tips08 = new Tips08("smile", 24);
        System.out.println(tips08);


    }



    @Override
    public int compareTo(Tips08 o) {
        return this.compare(this,o);
    }

    @Override
    public int compare(Tips08 o1, Tips08 o2) {
        if (o1.getAge() == o2.getAge()){
            return 0;
        }else if (o1.getAge() > o2.getAge()){
            return 1;
        }else{
            return -1;
        }
    }
}
