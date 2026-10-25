package com.itheima.oppextendstest7;

public class Test7 {
    public static void main(String[] args) {


        //定义两个个本科生
        undergraduate s1 = new undergraduate();
        s1.name = "张三";
        s1.age=19;
        s1.grade="yinianji";
        s1.study();

        undergraduate s2=new undergraduate("xiaoming",20,"erjianji");
        s2.study();
    }
}
