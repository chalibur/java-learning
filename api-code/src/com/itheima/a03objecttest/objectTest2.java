package com.itheima.a03objecttest;

public class objectTest2 {
    /*
    Object类中的equals方法源码：
    public boolean equals(Object obj) {
        return this == obj;
        this：调用equals方法的对象
        obj：参数对象，要比较的对象
        但是使用等等号进行比较，对于引用数据类型，比较的是内存地址，而对于基本数据类型，比较的是值
        所以默认使用new出来的对象虽然对象变量全部相等，但仍然结果是false，因为内存地址不同
    }

    ！！！如果需要比较对象的内容是否相等，需要重写equals方法
     */
    public static void main(String[] args) {
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("张三", 18);
        Student s3 = new Student("李四", 20);
        boolean b1 = s1.equals(s2);
        System.out.println(b1);
    }
}
