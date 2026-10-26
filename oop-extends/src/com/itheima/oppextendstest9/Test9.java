package com.itheima.oppextendstest9;

import java.sql.SQLOutput;

public class Test9 {
    /*
    业务场景：
    快递公司需要计算运费。基础快递包括单号String，重量int，收件人String
    行为：计算快递费（计算规则每公斤10元，不需要考虑小数部分）
    额外还有两种有基础快递衍生出来的特殊情况

    同城速递：重新计算快递费，在原有的基础上加10元

    异地空运：
    重新计算快递费，在原有的基础上加15元
     */
    public static void main(String[] args) {
        //1.定义一个普通快递
        Basics b1 = new Basics("001", 10, "张三");
        System.out.println("快递费："+b1.calculateFee());
        //2.定义一个同城速递
        System.out.println("----------------------------------------");
        city_delivery c1 = new city_delivery("002", 20, "李四");
        System.out.println("快递费："+c1.calculateFee());
        //3.定义一个异地空运
        System.out.println("--------------------------------------");;
        Air_freight a1 = new Air_freight("003", 30, "王五");
        System.out.println("快递单号为："+a1.getNumber()+",快递重量为"+a1.getWeight()+",快递收件人为"+a1.getMember());
        System.out.println("快递费："+a1.calculateFee());
    }
}
