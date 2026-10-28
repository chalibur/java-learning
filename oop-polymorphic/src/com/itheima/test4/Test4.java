package com.itheima.test4;

public class Test4 {
    /*
    小狗：
    属性：名字，颜色
    行为：狗吃骨头，狗看家，狗喝水

    小猫：
    属性：名字，颜色
    行为：猫吃鱼，猫捉老鼠，猫喝水
     */
    public static void main(String[] args){
        Dog d=new Dog("旺财","黄色");
        System.out.println("小狗的名字是"+d.getName()+"，颜色是"+d.getColour());
        d.eat();
        d.ability();
        d.drink();

        System.out.println("-------------------------------------");

        Cat c=new Cat("咪咪","白色");
        System.out.println("小猫的名字是"+c.getName()+"，颜色是"+c.getColour());
        c.eat();
        c.ability();
        c.drink();
    }
}
