package com.itheima.literl.ifDemo;

public class IfDemo5 {
    /*
    需求：
    很多app都有不同的优惠卷
    假设。现在有以下优惠券
    1.满10减8
    2.满50减30
    3.满100减50
    4.满200减90

    会员卡：全场六折
    请问：会员卡和优惠券不能同时使用，最优惠的价格是多少；
     */
    public static void main (String[] args){
        double price=1000;
        double discountprice=0;
        if (price >= 0) {
            if (price >= 200) {
                discountprice = price - 90;
            } else if (price >= 100) {
                discountprice = price - 50;
            } else if (price >= 50) {
                discountprice = price - 30;
            } else if (price >= 10) {
                discountprice = price - 8;
            } else {
                discountprice = price;
            }
            System.out.println("最优惠的价格是：" + discountprice); 
        }
    }
}
