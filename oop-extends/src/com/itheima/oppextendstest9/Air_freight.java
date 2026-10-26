package com.itheima.oppextendstest9;

public class Air_freight extends Basics {
    public Air_freight() {
    }

    public Air_freight(String number, int weight, String member) {
        super(number, weight, member);
    }

    @Override
    public int calculateFee() {
        return (super.calculateFee()+15);
    }
}
