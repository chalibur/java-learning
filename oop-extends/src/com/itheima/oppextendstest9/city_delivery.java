package com.itheima.oppextendstest9;

public class city_delivery extends Basics {
    //构造函数

    public city_delivery() {
    }

    public city_delivery(String number, int weight, String member) {
        super(number, weight, member);
    }

    @Override
    public int calculateFee() {
        return( super.calculateFee()+10);
    }
}
