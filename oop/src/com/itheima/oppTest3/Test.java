package com.itheima.oppTest3;

import java.lang.classfile.attribute.SourceDebugExtensionAttribute;

public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name="awei";
        t.age=30;

        System.out.println(t.name);
        System.out.println(t.age);
        //调用行为
        t.teach();
        t.eat();
    }
}
