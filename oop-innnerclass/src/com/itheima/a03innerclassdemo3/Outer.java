package com.itheima.a03innerclassdemo3;

public class Outer {

    private int a=10;
    class Inner{
        private  int a=20;
        public void show(){
            int a=30;

            System.out.println(Outer.this.a);//10
            //不能使用super.因为没有继承关系
            //这里只是内部和外部的关系，并非继承父类与子类的关系
            System.out.println(this.a);//20
            System.out.println(a);//30
        }


    }

}
