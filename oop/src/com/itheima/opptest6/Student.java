package com.itheima.opptest6;

/*
在校学生有属性：姓名，年龄，身高，体重
实现以下需求：
1.大一新生，张三，18岁，183cm，60kg，刚进大学努力学习
2.大二期间张三体重增加了10kg
3.大三期间张三减肥成功，身高增加2cm，体重减少3kg
4.打印大学毕业之后，张三的所有信息
 */

import com.sun.tools.attach.AgentLoadException;

public class Student {
    private String name;
    private int age;
    private int height;
    private int weight;
    //针对每个成员变量创建对应的set和get方法
    public  void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setage(int age){
        if(age >=0)
        this.age=age;
        else
            System.out.println("年龄设置失败");
    }
    public int getage(){
        return age;
    }
    public void setheight(int height){
        if(height>=0)
        this.height=height;
        else
            System.out.println("身高设置失败");
    }
    public int getheight(){
        return height;
    }
    public void setweight(int weight){
        if(weight>=0)
        this.weight=weight;
        else
            System.out.println("体重设置失败");
    }
    public int getweight(){
        return weight;
    }
    public void studey(){
        System.out.println(name+"正在努力学习");
    }
}
