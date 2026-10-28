package com.itheima.test1;

public class Test1 {

     //创建青蛙对象
    public static void main(String[] args) {
        Frog frog = new Frog("青青", "绿色");
        frog.eat();
        frog.swim();

        System.out.println(frog.getName() + "是" + frog.getColour() + "的");
        System.out.println("-------------------------------------------------");
    }
}
