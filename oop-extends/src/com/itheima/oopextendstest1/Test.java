package com.itheima.oopextendstest1;

public class Test {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name="xiaoshishi";
        s1.age=19;
        s1.grade="Yinianji";
        System.out.println(s1.name+" "+s1.age+" "+s1.grade);

        s1.eat();
        s1.Study();
        System.out.println();
        Teacher t=new Teacher();
        t.name="awei";
        t.age=20;
        t.subject="computer";
        t.Teach();

        System.out.println(t.name+" "+t.age+" "+t.subject);
    }

}
