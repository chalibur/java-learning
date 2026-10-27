package com.itheima.test1;

public class StudentManger {
    //定义一个方法表示注册用户
    public void register(Person person) {
        System.out.println("注册用户");
        System.out.println("姓名为" + person.getName() + "的账户注册成功，账号为" + person.getUsername() + "，密码" + person.getPassword());
        person.work();
    }
}
