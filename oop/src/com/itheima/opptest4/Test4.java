package com.itheima.opptest4;

public class Test4 {
    public static void main(String [] args){

        Cook c=new Cook();
        c.age=28;
        c.name="yanhahochen";
        c.cooklevel=5;


        System.out.println(c.name+" "+c.age+" "+c.cooklevel);
        c.cook();
    }
}
