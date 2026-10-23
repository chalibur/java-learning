package com.itheima.staticvariabletest1;

public class Test {
    /*
    学生有以下属性：
    姓名，年龄，老师
    一个班级中，所有的学生都是共享一个老师
    第一名学生：小诗诗，19岁
    第二名学生：小丹丹，20岁
    最初都是小文老师上课，有一天小丹丹提出申请换了老师，换成了阿玮老师
    利用static模拟上述效果

    关于static需要掌握的内容：
    1.静态变量，被当前所有的对象共享
    共享：只要有一个对象修改了静态变量，其他对象再次访问的时候就是需修改之后的结果了
    2.调用方式：
    1.通过对象名调用
    2.通过类名调用（推荐）
     */
    public static void main(String[] args){
        //创建的第一个学生对象
        Student s1=new Student();
        s1.name="小诗诗";
        s1.age=19;
        Student.teacherName="小文老师";
        Student s2=new Student();
        s2.name="小丹丹";
        s2.age=20;

        //输出打印
        System.out.println(s1.name+" "+s1.age+" "+Student.teacherName);
        System.out.println(s2.name+" "+s2.age+" "+Student.teacherName);

        //小丹丹申请换老师
        Student.setTeacherName("阿玮老师");
        System.out.println(s1.name+" "+s1.age+" "+Student.getTeacherName());
        System.out.println(s2.name+" "+s2.age+" "+Student.getTeacherName());
    }
}
