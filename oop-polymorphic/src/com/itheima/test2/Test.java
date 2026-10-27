package com.itheima.test2;

public class Test {
    public static void main(String[] args){
        Person p=new Person("xiaohuihui1",19,"male");
        System.out.println(p.getName()+" "+p.getAge()+" "+  p.getGender());
        Bicycle b= new Bicycle("feige",5);
        p.drive(b);
        Car c=new Car("binli",50);
        p.drive(c);
    }
}
