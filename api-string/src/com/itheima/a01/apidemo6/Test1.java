package com.itheima.a01.apidemo6;

public class Test1 {
    /*
    StringBuilder():创建一个可变容器

     */
    public static void main(String[] args) {
        //1.创建可变容器
        StringBuilder sb = new StringBuilder();
        System.out.println("sb：" + sb);
        System.out.println("sb.length：" + sb.length());

        //2.带参构造方法
        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println("sb2：" + sb2);
        sb2.append("aaaa");
        System.out.println("sb2：" + sb2);

        //反转方法
        sb2.reverse();
        System.out.println("sb2：" + sb2);

        //toString()
        String str = sb2.toString();
        System.out.println("str：" + str);
    }
}
