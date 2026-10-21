package com.itheima.opptest5;

public class Dog {
    private String name;
    private int age;
    //成员变量：
    //成员方法：
    public void setname(String value){
        name=value;
    }
    public String getname(){
        return name;
    }
    public void setage(int num){
        //判断num是否合法
        if(num>=0){
            age=num;
        }
        else{
            System.out.println("年龄设置失败");
        }
    }
    public int getage(){
        return age;
    }
}
