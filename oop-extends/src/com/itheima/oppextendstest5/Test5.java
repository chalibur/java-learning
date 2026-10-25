package com.itheima.oppextendstest5;

public class Test5 {
    public static void main(String [] args) {
        Student s = new Student("张三", 18, "高三");
        Teacher t = new Teacher();
        t.name ="awei";
        s.show();
        t.age=25;
        t.subject="Math";
        t.show();
    }
}
