package com.itheima.opptest7;

public class Test7 {
    public static void main(String[] args) {
        Student s1 = new Student();

        Student s2 = new Student("zhangsan", 18, "nan", 184);
        System.out.println(s2.getname());
        System.out.println(s2.getage());
        System.out.println(s2.getgender());
        System.out.println(s2.getheight());
    }
}
