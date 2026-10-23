package com.itheima.opptest6;

public class Test6 {
    public static void main(String[] args) {


    //创建学生对象
    Student s1 = new Student();
    s1.setname("zhangsan");
    s1.setage(18);
    s1.setheight(183);
    s1.setweight(60);
    System.out.println(s1.getname()+" "+s1.getage()+" "+s1.getheight()+" "+s1.getweight());
    s1.study();
    //要求2：
       int newweight=s1.getweight()+10;
       s1.setweight(newweight);
        System.out.println("zhangsan's newweight is:"+s1.getweight());

    //要求三：
        int newheight=s1.getheight()+2;
        s1.setheight(newheight);
        System.out.println("zhangsan's newheight is:"+s1.getheight());
        s1.study();
        int newweight1=s1.getweight()-3;
        s1.setweight(newweight1);
        System.out.println("zhangsan's newweight is:"+s1.getweight());

        //要求四：

    }
}
