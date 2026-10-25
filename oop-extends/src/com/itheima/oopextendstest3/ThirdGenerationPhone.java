package com.itheima.oopextendstest3;

public class ThirdGenerationPhone extends SecondGenerationPhone {
    @Override//注释：表示子类方法覆盖了父类方法
    //重写父类方法，快捷键alt+insert
    public void Call() {
        System.out.println("视频通话");
    }

    public void playGame(){
        System.out.println("玩手机游戏");
    }
}
