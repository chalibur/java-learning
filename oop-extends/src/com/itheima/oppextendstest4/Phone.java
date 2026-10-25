package com.itheima.oppextendstest4;

public class Phone extends IntelligentDevice{
    @Override
    public double caculate() {
        double pay=0.9*(super.caculate());
        System.out.println("手机会在原有的基础上再打九折");
        System.out.println("最终价格为"+pay);
        return pay;
    }
}
