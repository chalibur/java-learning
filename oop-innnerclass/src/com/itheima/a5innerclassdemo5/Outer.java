package com.itheima.a5innerclassdemo5;



public class Outer {
    public void show(){

        class Inner{
            String name;
            int age;
            public void  method(){
                System.out.println("内部类的方法被调用了");
            }
            Inner o1=new Inner();


        }
    }

}
