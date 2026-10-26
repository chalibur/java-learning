package com.itheima.oppextendstest7;

public class Test7 {
    public static void main(String[] args) {


        //定义2个本科生
        undergraduate s1 = new undergraduate();
        s1.name = "张三";
        s1.age=19;
        s1.grade="yinianji";
        s1.study();
        System.out.println("-----------------------------");
        undergraduate s2=new undergraduate("xiaoming",20,"erjianji");
        s2.study();
        System.out.println(s2.getAge()+", "+s2.getName()+", "+s2.getGrade()); // 输出: 20, xiaoming, erjianji

        System.out.println("-------------------------------");
        //定义一个研究生
        GraduateStudent g1=new GraduateStudent("xiaoming",20,"yinianji");
        g1.study();
        System.out.println(g1.getAge()+", "+g1.getName()+", "+g1.getGrade()); // 输出: 20, xiaoming, yinianji
        System.out.println("-------------------------------");

        //定义一个专业课老师
        ProfessionalTeacher p1=new ProfessionalTeacher("awei",30,"computer");
        p1.Teach();
        System.out.println("专业课老师的姓名是"+p1.name);
        System.out.println("专业课老师的年龄是"+p1.age);
        System.out.println("专业课老师的科目是"+p1.subject);

        System.out.println("-------------------------------");
        //定义一个通识课老师

        GeneralTeacher gt1=new GeneralTeacher();
        gt1.setAge(40);
        gt1.setName("dongfuguo");
        System.out.println("通识课老师的年龄是："+gt1.getAge()); // 输出: 40
        System.out.println("通识课老师的姓名是："+gt1.getName()); // 输出: dongfuguo
        System.out.println(gt1.getName()); // 输出: dongfuguo
        gt1.Teach();
    }
}
