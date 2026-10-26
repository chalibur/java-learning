package com.itheima.oppextendstest8;

public class Test8 {
    /*
    需求：
    1.经理：
    成员变量：姓名，工号，工资，管理奖金
    成员方法：工作（管理其他人），吃饭（吃米饭）

    2.厨师
    成员变量：工号，姓名，工资
    成员方法：工作（炒菜），吃饭（吃米饭）

     */
    public static void main(String   [] args){
        //定义一个经理
        Manager m=new Manager();
        m.setName("张三");
        m.setNumber(001);
        m.setSalary(10000);
        m.setBonus(5000);

        System.out.println("姓名："+m.getName()+"，工号："+m.getNumber()+"，工资："+m.getSalary()+"，管理奖金："+m.getBonus());
        m.work();
        m.eat();
        System.out.println("---------------------");
        //定义一个厨师
        cook c=new cook();
        c.setName("李四");
        c.setNumber(002);
        c.setSalary(8000);
        System.out.println("姓名："+c.getName()+"，工号："+c.getNumber()+"，工资："+c.getSalary());
        c.work();
        c.eat();
    }
}
