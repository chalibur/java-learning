package com.itheima.a01.apiarraylistDemo2;

import java.util.ArrayList;

public class Test2 {
    /*
    需求：
    定义一个集合，添加一些学生对象，学生类的属性为：id，姓名，年龄
    要求：
    1.遍历集合，将所有学生的属性打印到控制台上，每一个学生一行
    2.定义一个方法，根据id查找学生的信息
        存在：返回索引
        不存在：返回-1
     */
    public static void main(String [] args){
        ArrayList<Student> list=new ArrayList<>();
        //创建一些学生的对象
        Student s1=new Student("001","zahngsan",18);
        Student s2=new Student("002","lisi",19);
        Student s3=new Student("003","wangwu",20);

        //将学生对象添加到集合中
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getID()+" "+list.get(i).getName()+" "+list.get(i).getAge());
        }
        //调用方法
        findStudentByID(list,"002");

    }
    //定义一个方法，通过id查找学生的信息
    public static void findStudentByID(ArrayList<Student> list,String id){

        for (int i = 0; i < list.size(); i++) {
            if(id.equals(list.get(i).getID())){
                System.out.println("找到id为"+id+"的学生");
                System.out.println("该学生的姓名为："+list.get(i).getName()+"  ，该学生的年龄为："+list.get(i).getAge());
            }
            else
                System.out.println("没有找到id为"+id+"的学生");
        }
    }

}
