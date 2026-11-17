package com.itheima.a01.apiarraylistDemo2;

import java.util.ArrayList;

public class Test3 {
    /*
    由于集合只能存储引用数据类型，无法存储基本数据类型，所以当我们在集合中想存储基本数据类型的时候
    需要选择基本数据类型的包装类
    例如：
    double的包装类是Double
    boolean的包装类是Boolean
    long的包装类是Long
    float的包装类是Float
    特别需要注意的就是char类型和int类型
    char的包装类是Character
    int的包装类是Integer
     */

    /*
    需求：
    定义一个集合，添加数字，并进行遍历
    遍历格式参考：[1, 2, 3, 4, 5]
     */
    public static void main(String[] args){
    //1.创建一个集合
        ArrayList<Integer> list=new ArrayList<>();
        //2.添加数据
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
    }
}
