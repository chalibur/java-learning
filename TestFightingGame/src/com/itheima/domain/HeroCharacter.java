package com.itheima.domain;

import java.util.ArrayList;
//我方游戏人物角色
public class HeroCharacter extends Character {
    public ArrayList<String> skillList;

    public HeroCharacter(ArrayList<String> skillList) {
        super();
        this.skillList = skillList;
    }

    public HeroCharacter(String name, int HP, int attack, int defence) {
        super(name, HP, attack, defence);
        this.skillList = new ArrayList<>();
    }
    //行为：用来遍历技能列表
    public String showSkills(){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < skillList.size(); i++) {
            sb.append(skillList.get(i));
            if (i<skillList.size()-1){
                sb.append(",");
            }
        }
        return sb.toString();
    }

}
