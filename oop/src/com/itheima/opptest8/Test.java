package com.itheima.opptest8;

public class Test {
    public static void main(String[] aargs){
        Student s1=new Student("zhangsan",18);
        Student s2=new Student();

        s2.setName("xiaoming");
        s2.setAge(19);
        System.out.println(s1.getAge()+" "+s1.getName());
        System.out.println(s2.getAge()+" "+s2.getName());

    }
}
