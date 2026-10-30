package com.itheima.test4;

public class InterImpl {
    //接口中的静态方法不能被实现类重写，因为静态方法属于接口本身，而不是接口的实例
    //只有虚方法表中的方法才能被重写，方法的重写实际就是替换了虚方法表中记录方法的内存地址
    public void method() {
        System.out.println("实现类重写接口中的抽象方法");
    }
}
