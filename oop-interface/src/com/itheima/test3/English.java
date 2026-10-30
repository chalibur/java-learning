package com.itheima.test3;

public interface English {

    public abstract void English(Person person);

    public default void function(){
        System.out.println("接口中新增的默认方法");
        //接口中的新增的带有方法体的默认方法，不用强制重写
    }
}
