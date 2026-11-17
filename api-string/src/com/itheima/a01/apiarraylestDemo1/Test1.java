package com.itheima.a01.apiarraylestDemo1;

import java.util.ArrayList;

public class Test1 {
    //集合：长度可变的一种容器
    //ArrayList：数组的升级版，长度可变
    //可以先使用空参构造长度为0的对象
    // 如果没有进行限制，此时集合里面能存储各种类型的数据
    //泛型：限制集合中元素的类型，避免了类型转换的问题

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        System.out.println(list.get(1));
    }
}
