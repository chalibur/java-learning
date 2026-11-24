package com.itheima.ui;

import com.itheima.domain.User;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Login {
    public void start(){
        ArrayList<User> list=new ArrayList<>();

        while (true) {
            System.out.println("游戏登陆页面打开了");
            System.out.println("╔════════════════════════════════╗");
            System.out.println("    🎮 欢迎来到文字格斗游戏 🎮   ");
            System.out.println("╚════════════════════════════════╝");
            System.out.println("请选择操作：1登录 2注册 3退出");

            Scanner sc=new Scanner(System.in);
            String choice=sc.next();
            switch(choice){
                case "1"->login(list);
                case "2"-> register(list);//需要存在一个数据库，即一个容器，将所有创建的账户全部存储进去
                case "3"-> System.exit(0);//参数为0，表示正常停止，非0表示异常停止
                default-> System.out.println("输入有误，请重新输入");
            }
        }
    }
    public void login(ArrayList<User> list){
        System.out.println("用户选择登录操作");
        Scanner sc=new Scanner(System.in);

        //1.录入用户名，判断是否存在
        System.out.println("请输入用户名：");
        String username=sc.next();
        if(!contains(username,list)){
            System.out.println("用户名不存在，请先注册");
            return;
        }

        //2.判断账号是否被禁用
        int index=findIndex(list,username);
        if(!list.get(index).getState()){
            System.out.println("账号已禁用，请联系客服");
            return;
        }

        //3.验证码 -> 密码，逐轮校验；密码连续错3次禁用并退出
        int tryCount=0;
        while (true) {
            // 验证码校验：错则重新生成并重新输入
            while (true) {
                System.out.println("请输入验证码：");
                String rightcode=getCode();
                System.out.println("验证码是："+rightcode);
                if(rightcode.equals(sc.next())){
                    System.out.println("验证码输入正确");
                    break;
                }
                System.out.println("验证码输入错误，请重新输入");
            }
            // 密码校验：每一轮都重新录入
            System.out.println("请输入密码：");
            String password=sc.next();
            if(password.equals(list.get(index).getPassword())){
                System.out.println("登录成功");
                //创建FightingGame类的对象，并且调用方法启动游戏
                FightingGame game=new FightingGame();
                game.gameStart(username);
                break;
            }

            tryCount++;
            if(tryCount==3){
                System.out.println("密码输入错误次数过多，账号已禁用");
                list.get(index).setState(false);
                break;
            }
            System.out.println("密码输入错误，还可输入"+(3-tryCount)+"次，请重新输入");
        }
    }
    public void register(ArrayList<User> list){
        System.out.println("用户选择注册操作");
        //1.创建空参构造
        User u=new User();
        Scanner sc=new Scanner(System.in);

        //2 & 3.录入并校验用户名：长度 -> 格式 -> 唯一，全部通过才 break
        String username;
        while (true) {
            System.out.println("请输入用户名：");
            username = sc.next();

            // 长度校验
            if(!checkLength(username, 16, 3)){
                System.out.println("用户名长度必须在3 ~ 16位，请重新输入");
                continue;
            }

            // 格式校验：只能字母和数字，且不能纯数字
            int[] counts = getcount(username);//定义一个username长度的数组来存储字母、数字、其他字符的个数
            if(counts[2] > 0){
                System.out.println("用户名只能由字母、数字组成，请重新输入");
                continue;
            }
            if(counts[1] == username.length()){
                System.out.println("用户名不能是纯数字，请重新输入");
                continue;
            }

            // 唯一性校验
            if(contains(username, list)){
                System.out.println("用户名已存在，请重新输入");
                continue;
            }
            //只有当一切条件全部满足之后，才调用setUsername函数，将用户名设置到u对象中
            u.setUsername(username);
            break;
        }

        //5 & 6.录入并校验密码
        while (true) {
            System.out.println("请输入密码：");
            String password1=sc.next();
            System.out.println("请再次输入密码：");
            String password2=sc.next();

            if(!checkLength(password1,8,3)){
                System.out.println("密码长度必须在3 ~ 8位");
                continue;
            }
            if(!checkPassword(password1)){
                System.out.println("密码必须是字母加数字的组合，不能有其他字符");
                continue;
            }
            if(password1.equals(password2)){
                u.setPassword(password1);
                break;
            }else{
                System.out.println("两次输入的密码不一致，请重新输入");
            }
        }

        //8.将u添加到list中
        list.add(u);
        //9.提示成功
        System.out.println("注册成功");
    }
    //作用：判断字符串的长度是否在要求当中
    //字符串，指定的范围，最小值最大值
    //true符合要求 false不符合要求
    public boolean checkLength(String s,int max,int min){
        return s.length()>=min&&s.length()<=max;
    }
    //作用：判断用户名是否唯一
    //参数：用户名
    //true表示唯一 false表示不唯一
    public boolean contains(String username,ArrayList<User> list){
        for (int i = 0; i < list.size(); i++) {
            User u=list.get(i);
            if(u.getUsername().equals(username))
                return true;

        }
        return false;
    }

    //统计字符串中，数字，字母，其他字符分别有多少个
    //0索引：字母数
    //1索引：数字
    //2索引：其他字符
    public int[] getcount(String userinfo){
        int charcount=0;
        int numcount=0;
        int othercount=0;

        for (int i = 0; i < userinfo.length(); i++) {
            char c=userinfo.charAt(i);
            if(c>='0'&&c<='9')
                numcount++;
            else if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
                charcount++;
            else
                othercount++;
        }
        return new int[]{charcount,numcount,othercount};
    }

    //校验密码
    public boolean checkPassword(String password){
        int arr[]=getcount(password);
        return arr[0]>0&&arr[1]>0&&arr[2]==0;
    }

    public static String getCode(){
        /*
        验证码由四个大写或小写的字母和一个数字组成，数字可以在任何地方
         */
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char)('a'+i));
            list.add((char)('A'+i));
        }//创建一个集合，存储所有的大写和小写字母

        Random r = new Random();
        StringBuilder code=new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int index=r.nextInt(list.size());
            char c = list.get(index);
            code.append(c);//将获取的字符添加到验证码字符串中
        }
        //然后添加数字到验证码中,
        code.append(r.nextInt(10));
        char [] arr=code.toString().toCharArray();
        int i=r.nextInt(arr.length);
        //将最大索引的字符和随机索引的数字进行交换
        char tep=arr[arr.length-1];
        arr[arr.length-1]=arr[i];
        arr[i]=tep;



        String newcode=new String(arr);
        return newcode;


    }

    public int findIndex(ArrayList<User> list,String username) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUsername().equals(username))
                return i;
        }
        return -1;

    }

}
