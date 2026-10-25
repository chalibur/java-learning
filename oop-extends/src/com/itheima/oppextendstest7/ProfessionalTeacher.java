package com.itheima.oppextendstest7;

public class ProfessionalTeacher extends Teacher{
    //成员变量
    String subject;
    //构造方法

    public ProfessionalTeacher() {
        super();

    }

    public ProfessionalTeacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    //成员方法,需要重写，专业课老师教专业知识

    @Override
    public void Teach() {
        super.Teach();
        System.out.println("正在教"+this.subject+"专业知识");
    }
}
