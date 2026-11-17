package com.itheima.a01.apiarraylistDemo2;

import java.util.ArrayList;

public class Test1 {
    /*
        ArrayList集合的常用方法：
        add():添加元素
        remove():删除元素
        set():修改元素
        get():获取元素
        size():获取集合的长度
        clear():清空集合
        contains():判断集合中是否包含某个元素
        isEmpty():判断集合是否为空
        toArray():将集合转换为数组
     */
public static void main(String[] args){
    ArrayList<String> list=new ArrayList<>();
    //添加数据
    list.add("hello");
    list.add("world");//add方法天机数据类型是boolean
    //add方法在添加情况下永远成功
    //在集合当中不能添加基本数据类型，只能添加引用数据类型

    //修改操作
    list.set(0,"hello world");
    //小细节，index不能超过索引范围，否则会抛出异常

    //查找操作
    String s = list.get(0);
    System.out.println(s);
    //遍历操作
    //get（）加size（）
    for (int i = 0; i < list.size(); i++) {
        System.out.println(list.get(i));
    }

    System.out.println(list);
}

}
