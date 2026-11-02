package com.itheima.a01.apidemo2;

import javax.lang.model.element.Name;
import java.nio.charset.StandardCharsets;

public class Test2 {
    public static void main(String[] args){

        //1.直接赋值
        String name="yanghaochen";
        System.out.println(name);
        //2.new+构造方法的方式创造字符串对象
        String name2=new String();
        System.out.println("---------"+name2+"-----------");

        //3.通过有参构造构造
        String name3=new String("chenchen");
        System.out.println(name3);

        //4.根据字符数组创建
        char[]chs={'a','b','c','d','e','f'};
        String c=new String(chs);
        System.out.println(chs);

    }
}
/*
==比较运算符
1.基本数据类型：比较的是数据值

2.引用数据类型：比较的是内存地址

其实比较的是都是变量里面记录的数据，只不过基本数据类型记录的是数据值，而引用数据类型记录的是内存地址
 */

/*
字符串的比较：
boolean equals方法（要比较的字符串）

boolean equalsIgnorCase（忽略大小写的比较）


 */