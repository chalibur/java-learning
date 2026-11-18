package com.itheima.ui;

import java.util.Scanner;

public class Login {
    public void start(){
        while (true) {
            System.out.println("游戏登陆页面打开了");
            System.out.println("╔════════════════════════════════╗");
            System.out.println("    🎮 欢迎来到文字格斗游戏 🎮   ");
            System.out.println("╚════════════════════════════════╝");
            System.out.println("请选择操作：1登录 2注册 3退出");

            Scanner sc=new Scanner(System.in);
            String choice=sc.next();
            switch(choice){
                case "1"->login();
                case "2"-> register();
                case "3"-> System.exit(0);//参数为0，表示正常停止，非0表示异常停止
                default-> System.out.println("输入有误，请重新输入");
            }
        }
    }
    public void login(){
        System.out.println("用户选择登录操作");
    }
    public void register(){
        System.out.println("用户选择注册操作");
    }

}
