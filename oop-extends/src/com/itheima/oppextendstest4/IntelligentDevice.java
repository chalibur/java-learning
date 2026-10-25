package com.itheima.oppextendstest4;

public class IntelligentDevice {
     String name;//商品名
     int price;//商品价格

    public void show(){
        System.out.println("商品名："+name+"，商品价格："+price);
    }

    public double caculate(){
        double money=0.0;
        if(price<1000){
             money=price;
            System.out.println("商品价格小于1000,不打折，最终价格为"+money);
        }
        else if(price<5000){
             money=price*0.9;
            System.out.println("商品价格在1000-5000之间，打9折，最终价格为"+money);
        }
        else if(price<10000){
             money=price*0.8;
            System.out.println("商品价格在5000-10000之间，打8折，最终价格为"+money);
        }
        else{
             money=price*0.7;
            System.out.println("商品价格大于10000，打7折，最终价格为"+money);
        }
        return money;//返回最终价格
    }

}
