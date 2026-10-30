package com.itheima.test3;

public class Test3 {
    /* 英语
    为了出国交流，跟乒乓球相关的人员都需要学习英语
    请用所有知识分析，在这个案例中，哪些是具体类，那些事抽象类，哪些是接口

    乒乓球运动员：姓名，年龄，学打乒乓球，说英语
    篮球运动员：姓名，年龄，学打篮球
    乒乓球教练：姓名，年龄，教打乒乓球，说英语
    篮球教练：姓名，年龄，教打篮球
     */

    public static void main(String[] args){
        //定义一个乒乓球运动员
        Pingpong_Athletes p1=new Pingpong_Athletes("张三",18);
        System.out.println(p1.getName()+",年龄是"+p1.getAge());
        p1.study();
        p1.English(p1);
        System.out.println("----------------------------");
        //定义一个乒乓球教练
        Pingpong_Coach p2=new Pingpong_Coach();
        p2.setName("李四");
        p2.setAge(20);
        System.out.println(p2.getName()+",年龄是"+p2.getAge());
        p2.teach();
        p2.English(p2);
        p2.function();
    }


}
