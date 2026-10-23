package com.itheima.staticvariabletest1;

public class Student {
     String name;
     int age;
     //一个班级的学生共享一个老师
     static String teacherName;//当是共享的就需要加上static静态关键字

     public Student() {
     }



     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public int getAge() {
          return age;
     }

     public void setAge(int age) {
          this.age = age;
     }

     public static String getTeacherName() {
          return teacherName;
     }

     public static void setTeacherName(String teacherName) {
          Student.teacherName = teacherName;
     }
}
