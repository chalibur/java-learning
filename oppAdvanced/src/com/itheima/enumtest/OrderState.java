package com.itheima.enumtest;

public enum OrderState {
   //枚举有限对象
    PAYMENT_PENDING("待支付"),
    PROCESSING("处理中"),
    SHIPPED("已发货"),
    DELIVERED("已送达"),
    CANCELED("已取消");


    private String name;

    //枚举类的构造方法默认是private，就算不写JVM也会自己加上private


    private OrderState(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
